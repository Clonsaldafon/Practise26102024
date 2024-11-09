package ru.clonsaldafon.practise26_10_2024.presentation.intercom

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import ru.clonsaldafon.practise26_10_2024.data.model.Intercom
import ru.clonsaldafon.practise26_10_2024.domain.GetIntercomUseCase
import ru.clonsaldafon.practise26_10_2024.domain.OpenIntercomUseCase
import javax.inject.Inject

class MainIntercomViewModel @Inject constructor(
    private val getIntercomUseCase: GetIntercomUseCase,
    private val openIntercomUseCase: OpenIntercomUseCase
) : ViewModel() {

    private val _screenState = MutableLiveData<List<Intercom>?>()
    val screenState: LiveData<List<Intercom>?>
        get() = _screenState

    fun loadIntercomList() {
        viewModelScope.launch {
            val intercoms = getIntercomUseCase()

            _screenState.postValue(intercoms)
        }
    }

    fun openIntercom() = viewModelScope.launch {
        openIntercomUseCase()
    }
}