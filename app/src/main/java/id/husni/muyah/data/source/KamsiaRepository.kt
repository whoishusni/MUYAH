/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.data.source

import androidx.lifecycle.LiveData
import id.husni.muyah.data.source.local.LocalDataSource
import id.husni.muyah.data.source.local.entity.Campus
import id.husni.muyah.data.source.local.entity.Hospital
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.data.source.local.entity.Office

class KamsiaRepository(private val localDataSource: LocalDataSource) {

    //office
    suspend fun insertOffice(list: List<Office>) = localDataSource.insertOffice(list)
    fun getAllOffice() : LiveData<List<Office>> = localDataSource.getAllOffice()

    //campus
    suspend fun insertCampus(list: List<Campus>) = localDataSource.insertCampus(list)
    fun getAllCampus(): LiveData<List<Campus>> = localDataSource.getAllCampus()

    //market
    suspend fun insertMarket(list: List<Market>) = localDataSource.insertMarket(list)
    fun getAllMarket(): LiveData<List<Market>> = localDataSource.getAllMarket()

    //hospital
    suspend fun insertHospital(list: List<Hospital>) = localDataSource.insertHospital(list)
    fun getAllHospital(): LiveData<List<Hospital>> = localDataSource.getAllHospital()

}