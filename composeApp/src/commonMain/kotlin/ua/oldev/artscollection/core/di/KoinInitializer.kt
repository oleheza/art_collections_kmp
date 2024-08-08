package ua.oldev.artscollection.core.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

fun initKoin(onKoinInitialized: KoinApplication.() -> Unit = {}) {
    startKoin {
        onKoinInitialized.invoke(this)
    }
}