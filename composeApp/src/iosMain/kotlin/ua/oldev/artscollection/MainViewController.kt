package ua.oldev.artscollection

import androidx.compose.ui.window.ComposeUIViewController
import ua.oldev.artscollection.core.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) {
    App()
}