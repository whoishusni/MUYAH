/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.campus

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.MuyahRepository
import id.husni.muyah.data.source.local.entity.Campus

class CampusViewModel(private val muyahRepository: MuyahRepository): ViewModel() {
    suspend fun insertCampus(list: List<Campus>) = muyahRepository.insertCampus(list)
    fun getAllCampus(): LiveData<List<Campus>> = muyahRepository.getAllCampus()
}