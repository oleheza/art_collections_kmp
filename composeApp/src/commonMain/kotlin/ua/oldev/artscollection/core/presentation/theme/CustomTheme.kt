package ua.oldev.artscollection.core.presentation.theme

import androidx.compose.runtime.Composable

@Composable
expect fun CustomTheme(
    darkTheme: Boolean,
    dynamicColors: Boolean,
    content: @Composable () -> Unit
)