package ua.oldev.artscollection.core.data.network

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import org.koin.core.annotation.Single

@Single
actual class HttpClientProvider {
    actual fun provideHttpClient() = HttpClient(OkHttp)
}