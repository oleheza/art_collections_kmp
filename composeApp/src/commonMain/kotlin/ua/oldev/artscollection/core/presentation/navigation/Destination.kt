package ua.oldev.artscollection.core.presentation.navigation

sealed class Destination(
    protected val route: String,
    vararg params: String
) {

    val fullRoute = if (params.isEmpty()) {
        route
    } else {
        buildString {
            append(route)
            params.forEach { param ->
                append("/${param}")
            }
        }
    }

    sealed class NoArgumentDestination(route: String) : Destination(route = route) {
        operator fun invoke() = route
    }
}