package alfianyusufabdullah.hilt.data.repository

import alfianyusufabdullah.hilt.data.source.QuoteService
import javax.inject.Inject

class QuoteRepositoryImpl @Inject constructor(private val quoteService: QuoteService): QuoteRepository {
    override suspend fun getRandomQuote() = quoteService.getRandomQuote()
}