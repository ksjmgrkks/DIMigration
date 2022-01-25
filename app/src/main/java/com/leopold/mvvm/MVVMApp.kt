package com.leopold.mvvm

import android.app.Application
import com.leopold.mvvm.di.apiModule
import com.leopold.mvvm.di.roomModule
import com.leopold.mvvm.di.networkModule
import com.leopold.mvvm.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

/**
 * @author Leopold
 */
@Suppress("Unused")
class MVVMApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MVVMApp)
            modules(networkModule)
            modules(apiModule)
            modules(roomModule)
            modules(viewModelModule)
        }

    }


}