package ru.clonsaldafon.practise26_10_2024.presentation.intercom

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import coil3.load
import coil3.network.NetworkHeaders
import coil3.network.httpHeaders
import ru.clonsaldafon.practise26_10_2024.R
import ru.clonsaldafon.practise26_10_2024.databinding.FragmentMainIntercomBinding
import ru.clonsaldafon.practise26_10_2024.di.DaggerAppComponent
import ru.clonsaldafon.practise26_10_2024.di.ViewModelFactory
import javax.inject.Inject

class MainIntercomFragment : Fragment(R.layout.fragment_main_intercom) {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val binding: FragmentMainIntercomBinding by viewBinding()
    private val viewModel: MainIntercomViewModel by viewModels { viewModelFactory }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.screenState.observe(viewLifecycleOwner) { list ->
            val intercom = list?.first() ?: return@observe

            binding.openIntercomButton.text = intercom.name
        }

        viewModel.loadIntercomList()

        binding.openIntercomButton.setOnClickListener {
            viewModel.openIntercom()
        }

        binding.intercomSnapshot.load(
            "http://192.168.0.104/camera/snapshot"
        ) {
            httpHeaders(
                NetworkHeaders.Builder(

                )
            )
        }
    }

    // вот так не надо
    override fun onAttach(context: Context) {
        val component = DaggerAppComponent.create()
        super.onAttach(context)
    }

}