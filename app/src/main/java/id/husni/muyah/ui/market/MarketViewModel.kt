/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.market

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.KamsiaRepository
import id.husni.muyah.data.source.local.entity.Market

class MarketViewModel(private val kamsiaRepository: KamsiaRepository): ViewModel()  {
    suspend fun insertMarket(list: List<Market>) = kamsiaRepository.insertMarket(list)
    fun getAllMarket(): LiveData<List<Market>> = kamsiaRepository.getAllMarket()
}