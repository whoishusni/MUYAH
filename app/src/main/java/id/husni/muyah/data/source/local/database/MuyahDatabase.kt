/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.data.source.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import id.husni.muyah.data.source.local.entity.Campus
import id.husni.muyah.data.source.local.entity.Hospital
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.data.source.local.entity.Office

@Database(entities = [Office::class, Campus::class, Market::class, Hospital::class], version = 2, exportSchema = false)
abstract class MuyahDatabase : RoomDatabase() {
    abstract fun muyahDao(): MuyahDao

}