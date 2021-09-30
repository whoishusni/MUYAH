/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */


package id.husni.muyah

import android.app.Application
import id.husni.muyah.di.dataSourceModule
import id.husni.muyah.di.databaseModule
import id.husni.muyah.di.repositoryModule
import id.husni.muyah.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApp)
            modules(listOf(
                databaseModule,
                dataSourceModule,
                repositoryModule,
                viewModelModule
            ))
        }
    }
}