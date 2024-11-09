package ru.clonsaldafon.practise26_10_2024.domain

import retrofit2.Response
import ru.clonsaldafon.practise26_10_2024.data.IntercomRepository
import javax.inject.Inject

class OpenIntercomUseCaseImpl @Inject constructor(
    private val repository: IntercomRepository
) : OpenIntercomUseCase {
    override suspend fun invoke(): Response<Unit> =
        repository.openIntercom()
}