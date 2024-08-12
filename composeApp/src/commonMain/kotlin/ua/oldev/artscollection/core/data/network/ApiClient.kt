package ua.oldev.artscollection.core.data.network

import io.ktor.client.call.body
import io.ktor.client.request.get
import org.koin.core.annotation.Single
import ua.oldev.artscollection.core.data.dto.ArtObjectDTO

@Single
class ApiClient(
    private val httpClientFactory: HttpClientFactory
) {
    private val httpClient by lazy {
        httpClientFactory.createHttpClient(true)
    }

    suspend fun getAllArtObjects(): List<ArtObjectDTO> {
        return httpClient.get(BASE_URL).body()
    }

    companion object {
        private const val BASE_URL =
            "https://raw.githubusercontent.com/Kotlin/KMP-App-Template/main/list.json"
    }
}