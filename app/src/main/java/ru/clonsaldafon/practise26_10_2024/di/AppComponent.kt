package ru.clonsaldafon.practise26_10_2024.di

import dagger.Component
import ru.clonsaldafon.practise26_10_2024.presentation.intercom.MainIntercomFragment

@Component(
    modules = [
        AppBindsModule::class,
        ViewModelModule::class,
        NetworkModule::class
    ]
)
interface AppComponent {

    fun inject(fragment: MainIntercomFragment)
}