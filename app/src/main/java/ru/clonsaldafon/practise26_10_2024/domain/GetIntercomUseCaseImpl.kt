package ru.clonsaldafon.practise26_10_2024.domain

import ru.clonsaldafon.practise26_10_2024.data.IntercomRepository
import ru.clonsaldafon.practise26_10_2024.data.model.Intercom
import javax.inject.Inject

class GetIntercomUseCaseImpl @Inject constructor(
    private val repository: IntercomRepository
): GetIntercomUseCase {

    override suspend operator fun invoke(): List<Intercom> =
        repository.getIntercoms()

}