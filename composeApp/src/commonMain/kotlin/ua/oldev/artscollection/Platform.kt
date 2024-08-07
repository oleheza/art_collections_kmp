package ua.oldev.artscollection

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform