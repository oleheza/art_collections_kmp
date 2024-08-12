package ua.oldev.artscollection.core.data.network

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.logging.DEFAULT
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.annotation.Single

@Single
class HttpClientFactory(
    private val httpClientProvider: HttpClientProvider
) {
    fun createHttpClient(enableLogging: Boolean): HttpClient {
        return httpClientProvider.provideHttpClient().config {
            install(ContentNegotiation) {
                json(
                    Json {
                        prettyPrint = true
                        ignoreUnknownKeys = true
                        isLenient = true
                    }
                )
            }
            if (enableLogging) {
                install(Logging) {
                    logger = Logger.DEFAULT
                    level = LogLevel.ALL
                }
            }
        }
    }
}