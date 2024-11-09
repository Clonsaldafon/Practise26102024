package ru.clonsaldafon.practise26_10_2024.di

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.clonsaldafon.practise26_10_2024.data.network.IntercomService

@Module
class NetworkModule {

    @Provides
    fun provideIntercomService(): IntercomService =
        Retrofit.Builder()
            .baseUrl("http://192.168.0.104/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create()
}