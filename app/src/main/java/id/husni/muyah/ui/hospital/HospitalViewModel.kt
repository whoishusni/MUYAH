/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.hospital

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.KamsiaRepository
import id.husni.muyah.data.source.local.entity.Hospital

class HospitalViewModel(private val kamsiaRepository: KamsiaRepository): ViewModel() {
    suspend fun insertHospital(list: List<Hospital>) = kamsiaRepository.insertHospital(list)
    fun getAllHospital(): LiveData<List<Hospital>> = kamsiaRepository.getAllHospital()
}