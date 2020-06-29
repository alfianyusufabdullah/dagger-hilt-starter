package alfianyusufabdullah.hilt.data.repository

import alfianyusufabdullah.hilt.data.entity.QuoteResponse

interface QuoteRepository {
    suspend fun getRandomQuote(): QuoteResponse
}