/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.office

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.MuyahRepository
import id.husni.muyah.data.source.local.entity.Office

class OfficeViewModel(private val muyahRepository: MuyahRepository): ViewModel() {

    fun getAllOffice() : LiveData<List<Office>> = muyahRepository.getAllOffice()
    suspend fun insertOffice(list: List<Office>) = muyahRepository.insertOffice(list)
}