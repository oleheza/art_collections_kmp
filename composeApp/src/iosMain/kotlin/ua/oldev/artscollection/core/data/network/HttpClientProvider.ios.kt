package ua.oldev.artscollection.core.data.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.darwin.Darwin
import org.koin.core.annotation.Single

@Single
actual class HttpClientProvider {
    actual fun provideHttpClient() = HttpClient(Darwin)
}