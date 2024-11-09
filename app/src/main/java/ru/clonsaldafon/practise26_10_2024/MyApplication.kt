package ru.clonsaldafon.practise26_10_2024

import android.app.Application
import ru.clonsaldafon.practise26_10_2024.di.AppComponent
import ru.clonsaldafon.practise26_10_2024.di.DaggerAppComponent

class MyApplication : Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }
}