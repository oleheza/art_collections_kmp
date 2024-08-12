package ua.oldev.artscollection

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import ua.oldev.artscollection.core.presentation.navigation.AppNavigation
import ua.oldev.artscollection.core.presentation.navigation.CollectionsList
import ua.oldev.artscollection.core.presentation.theme.CustomTheme

@Composable
fun App(
    darkTheme: Boolean,
    useDynamicColors: Boolean
) {

    val navController = rememberNavController()

    CustomTheme(
        darkTheme = darkTheme,
        dynamicColors = useDynamicColors
    ) {
        AppNavigation(
            navHostController = navController,
            startDestination = CollectionsList
        )
    }
}