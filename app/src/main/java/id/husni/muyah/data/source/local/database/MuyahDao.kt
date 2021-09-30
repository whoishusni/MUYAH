/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.data.source.local.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import id.husni.muyah.data.source.local.entity.Campus
import id.husni.muyah.data.source.local.entity.Hospital
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.data.source.local.entity.Office

@Dao
interface MuyahDao {
    //office word query
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertOffice(list: List<Office>)

    @Query("SELECT * FROM office_word ORDER BY id ASC")
    fun getAllOffice(): LiveData<List<Office>>

    //campus word query
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCampus(list: List<Campus>)

    @Query("SELECT * FROM campus_word ORDER BY id ASC")
    fun getAllCampus(): LiveData<List<Campus>>

    //market word query
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMarket(list: List<Market>)

    @Query("SELECT * FROM market_word ORDER BY id ASC")
    fun getAllMarket(): LiveData<List<Market>>

    //hospital word query
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertHospital(list: List<Hospital>)

    @Query("SELECT * FROM hospital_word ORDER BY id ASC")
    fun getAllHospital(): LiveData<List<Hospital>>
}