/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.office

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.KamsiaRepository
import id.husni.muyah.data.source.local.entity.Office

class OfficeViewModel(private val kamsiaRepository: KamsiaRepository): ViewModel() {

    fun getAllOffice() : LiveData<List<Office>> = kamsiaRepository.getAllOffice()
    suspend fun insertOffice(list: List<Office>) = kamsiaRepository.insertOffice(list)
}