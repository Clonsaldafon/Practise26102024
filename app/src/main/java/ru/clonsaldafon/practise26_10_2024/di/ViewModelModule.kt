package ru.clonsaldafon.practise26_10_2024.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import ru.clonsaldafon.practise26_10_2024.presentation.intercom.MainIntercomViewModel

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainIntercomViewModel::class)
    abstract fun bindMainIntercomViewModel(viewModel: MainIntercomViewModel): ViewModel
}