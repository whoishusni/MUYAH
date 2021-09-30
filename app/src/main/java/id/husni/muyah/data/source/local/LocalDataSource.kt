/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */
package id.husni.muyah.data.source.local

import androidx.lifecycle.LiveData
import id.husni.muyah.data.source.local.database.MuyahDao
import id.husni.muyah.data.source.local.entity.Campus
import id.husni.muyah.data.source.local.entity.Hospital
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.data.source.local.entity.Office

class LocalDataSource(private val muyahDao: MuyahDao) {

    //office
    suspend fun insertOffice(list: List<Office>) = muyahDao.insertOffice(list)
    fun getAllOffice(): LiveData<List<Office>> = muyahDao.getAllOffice()

    //campus
    suspend fun insertCampus(list: List<Campus>) = muyahDao.insertCampus(list)
    fun getAllCampus(): LiveData<List<Campus>> = muyahDao.getAllCampus()

    //market
    suspend fun insertMarket(list: List<Market>) = muyahDao.insertMarket(list)
    fun getAllMarket(): LiveData<List<Market>> = muyahDao.getAllMarket()

    //hospital
    suspend fun insertHospital(list: List<Hospital>) = muyahDao.insertHospital(list)
    fun getAllHospital(): LiveData<List<Hospital>> = muyahDao.getAllHospital()
}