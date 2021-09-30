/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.campus

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.KamsiaRepository
import id.husni.muyah.data.source.local.entity.Campus

class CampusViewModel(private val kamsiaRepository: KamsiaRepository): ViewModel() {
    suspend fun insertCampus(list: List<Campus>) = kamsiaRepository.insertCampus(list)
    fun getAllCampus(): LiveData<List<Campus>> = kamsiaRepository.getAllCampus()
}