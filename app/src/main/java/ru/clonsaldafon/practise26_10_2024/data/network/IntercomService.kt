package ru.clonsaldafon.practise26_10_2024.data.network

import retrofit2.Response
import retrofit2.http.Header
import retrofit2.http.PUT

interface IntercomService {

    @PUT("relay/1/open")
    suspend fun openIntercom(
        @Header("Authorization") auth: String = "Basic cm9vdDoxMjM0NTY="
    ): Response<Unit>
}