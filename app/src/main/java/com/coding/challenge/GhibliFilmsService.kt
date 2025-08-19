package com.coding.challenge

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GhibliFilmsService {

    @GET("films?limit={limit}")
    suspend fun films(@Query("limit") limit: Int = 30): List<Film>
}
