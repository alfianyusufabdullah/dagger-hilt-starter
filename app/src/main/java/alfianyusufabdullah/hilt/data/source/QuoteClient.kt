package alfianyusufabdullah.hilt.data.source

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class QuoteClient {

    fun getClient(): Retrofit = Retrofit.Builder()
        .baseUrl("https://programming-quotes-api.herokuapp.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}