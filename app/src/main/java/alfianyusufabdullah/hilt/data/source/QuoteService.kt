package alfianyusufabdullah.hilt.data.source

import alfianyusufabdullah.hilt.data.entity.QuoteResponse
import retrofit2.http.GET

interface QuoteService {

    @GET("quotes/random")
    suspend fun getRandomQuote(): QuoteResponse
}