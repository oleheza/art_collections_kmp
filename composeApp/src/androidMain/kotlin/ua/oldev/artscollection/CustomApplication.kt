package ua.oldev.artscollection

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import ua.oldev.artscollection.core.di.initKoin

class CustomApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidContext(this@CustomApplication.applicationContext)
            androidLogger()
        }
    }
}