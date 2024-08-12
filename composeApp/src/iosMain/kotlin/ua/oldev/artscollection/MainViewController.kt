package ua.oldev.artscollection

import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIScreen
import platform.UIKit.UIUserInterfaceStyle
import ua.oldev.artscollection.core.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = { initKoin() }
) {

    val isDarkMode =
        UIScreen.mainScreen.traitCollection.userInterfaceStyle == UIUserInterfaceStyle.UIUserInterfaceStyleDark

    App(
        useDynamicColors = false,
        darkTheme = isDarkMode
    )
}