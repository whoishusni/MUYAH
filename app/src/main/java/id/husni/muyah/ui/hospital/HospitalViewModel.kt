/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.hospital

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.MuyahRepository
import id.husni.muyah.data.source.local.entity.Hospital

class HospitalViewModel(private val muyahRepository: MuyahRepository): ViewModel() {
    suspend fun insertHospital(list: List<Hospital>) = muyahRepository.insertHospital(list)
    fun getAllHospital(): LiveData<List<Hospital>> = muyahRepository.getAllHospital()
}