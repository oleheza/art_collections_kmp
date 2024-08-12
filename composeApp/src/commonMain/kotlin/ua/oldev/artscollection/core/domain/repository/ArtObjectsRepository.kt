package ua.oldev.artscollection.core.domain.repository

import ua.oldev.artscollection.core.data.dto.ArtObjectDTO

interface ArtObjectsRepository {
    suspend fun getAll(): Result<List<ArtObjectDTO>>
    suspend fun getById(id: String): Result<ArtObjectDTO?>
}