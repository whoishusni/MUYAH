/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.market

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import id.husni.muyah.data.source.MuyahRepository
import id.husni.muyah.data.source.local.entity.Market

class MarketViewModel(private val muyahRepository: MuyahRepository): ViewModel()  {
    suspend fun insertMarket(list: List<Market>) = muyahRepository.insertMarket(list)
    fun getAllMarket(): LiveData<List<Market>> = muyahRepository.getAllMarket()
}