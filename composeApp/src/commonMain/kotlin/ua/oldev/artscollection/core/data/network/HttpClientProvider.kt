package ua.oldev.artscollection.core.data.network

import io.ktor.client.HttpClient
import org.koin.core.annotation.Single

@Single
expect class HttpClientProvider {
    fun provideHttpClient(): HttpClient
}