package ru.clonsaldafon.practise26_10_2024.data

import kotlinx.coroutines.delay
import ru.clonsaldafon.practise26_10_2024.data.model.Intercom
import ru.clonsaldafon.practise26_10_2024.data.network.IntercomService
import javax.inject.Inject
import kotlin.random.Random

class IntercomRepositoryImpl @Inject constructor(
    private val service: IntercomService
) : IntercomRepository {

    override suspend fun getIntercoms(): List<Intercom> {
        delay(Random.nextLong(1000, 5000))

        return listOf(
            Intercom("Sokol ISCom X1"),
            Intercom("Beware DKS15374")
        )
    }

    override suspend fun openIntercom() {
        service.openIntercom()
    }
}