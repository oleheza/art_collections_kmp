package ua.oldev.artscollection.core.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    startDestination: Destination
) {
    CustomNavHost(
        modifier = modifier,
        navHostController = navHostController,
        startDestination = startDestination
    ) {
        composable(CollectionsList) {

        }
    }
}