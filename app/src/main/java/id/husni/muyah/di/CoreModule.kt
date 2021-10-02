/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.di

import androidx.room.Room
import id.husni.muyah.data.source.MuyahRepository
import id.husni.muyah.data.source.local.LocalDataSource
import id.husni.muyah.data.source.local.database.MuyahDatabase
import id.husni.muyah.ui.campus.CampusViewModel
import id.husni.muyah.ui.hospital.HospitalViewModel
import id.husni.muyah.ui.market.MarketViewModel
import id.husni.muyah.ui.office.OfficeViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val databaseModule = module {
    factory { get<MuyahDatabase>().muyahDao() }
    single {
        Room.databaseBuilder(androidContext(), MuyahDatabase::class.java, "muyah.db")
            .fallbackToDestructiveMigration()
            .build()
    }
}

val dataSourceModule = module {
    single { LocalDataSource(get()) }
}
val repositoryModule = module {
    single { MuyahRepository(get()) }
}

val viewModelModule = module {
    viewModel { OfficeViewModel(get()) }
    viewModel { CampusViewModel(get()) }
    viewModel { MarketViewModel(get()) }
    viewModel { HospitalViewModel(get()) }
}