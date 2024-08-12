package ua.oldev.artscollection.core.presentation.navigation

data object CollectionsList : Destination.NoArgumentDestination("collections")

internal fun String.appendParams(vararg params: Pair<String, Any?>): String {
    return buildString {
        append(this)
        params.forEach { param ->
            param.second?.toString()?.let { argument ->
                append("/${argument}")
            }
        }
    }
}