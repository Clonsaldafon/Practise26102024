package ru.clonsaldafon.practise26_10_2024.di

import dagger.Binds
import dagger.Module
import ru.clonsaldafon.practise26_10_2024.data.IntercomRepository
import ru.clonsaldafon.practise26_10_2024.data.IntercomRepositoryImpl
import ru.clonsaldafon.practise26_10_2024.domain.GetIntercomUseCase
import ru.clonsaldafon.practise26_10_2024.domain.GetIntercomUseCaseImpl
import ru.clonsaldafon.practise26_10_2024.domain.OpenIntercomUseCase
import ru.clonsaldafon.practise26_10_2024.domain.OpenIntercomUseCaseImpl

@Module
interface AppBindsModule {

    @Binds
    fun bindIntercomRepository(repository: IntercomRepositoryImpl): IntercomRepository

    @Binds
    fun bindGetIntercomsUseCase(useCase: GetIntercomUseCaseImpl): GetIntercomUseCase

    @Binds
    fun bindOpenIntercomUseCase(useCase: OpenIntercomUseCaseImpl): OpenIntercomUseCase
}