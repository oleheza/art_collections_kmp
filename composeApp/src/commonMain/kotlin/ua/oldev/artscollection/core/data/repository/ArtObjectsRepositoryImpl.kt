package ua.oldev.artscollection.core.data.repository

import org.koin.core.annotation.Single
import ua.oldev.artscollection.core.data.dto.ArtObjectDTO
import ua.oldev.artscollection.core.data.network.ApiClient
import ua.oldev.artscollection.core.domain.repository.ArtObjectsRepository

@Single
class ArtObjectsRepositoryImpl(
    private val apiClient: ApiClient
) : ArtObjectsRepository {

    private val cache = mutableListOf<ArtObjectDTO>()

    override suspend fun getAll(): Result<List<ArtObjectDTO>> {
        return if (cache.isEmpty()) {
            try {
                val data = apiClient.getAllArtObjects()
                refreshCache(data)
                Result.success(data)
            } catch (e: Exception) {
                Result.failure(e)
            }
        } else {
            Result.success(cache)
        }
    }

    override suspend fun getById(id: String): Result<ArtObjectDTO?> {
        val item = cache.firstOrNull { item -> item.objectId == id }
        return Result.success(item)
    }

    private fun refreshCache(items: List<ArtObjectDTO>) {
        cache.clear()
        cache.addAll(items)
    }
}