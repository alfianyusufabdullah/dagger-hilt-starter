package alfianyusufabdullah.hilt.di

import alfianyusufabdullah.hilt.data.repository.QuoteRepositoryImpl
import alfianyusufabdullah.hilt.data.source.QuoteClient
import alfianyusufabdullah.hilt.data.source.QuoteService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideQuoteClient() = QuoteClient()

    @Provides
    @Singleton
    fun provideQuoteServices(client: QuoteClient): QuoteService =
        client.getClient().create(QuoteService::class.java)

    @Provides
    @Singleton
    fun provideQuoteRepository(apiService: QuoteService) = QuoteRepositoryImpl(apiService)

}