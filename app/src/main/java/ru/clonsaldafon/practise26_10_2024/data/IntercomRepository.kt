package ru.clonsaldafon.practise26_10_2024.data

import retrofit2.Response
import ru.clonsaldafon.practise26_10_2024.data.model.Intercom

interface IntercomRepository {
    suspend fun getIntercoms(): List<Intercom>
    suspend fun openIntercom(): Response<Unit>
}