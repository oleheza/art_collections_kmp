package ua.oldev.artscollection.core.di

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.ksp.generated.module
import ua.oldev.artscollection.core.di.modules.AppModule

fun initKoin(onKoinInitialized: KoinApplication.() -> Unit = {}) {
    startKoin {
        modules(AppModule().module)
        onKoinInitialized.invoke(this)
    }
}