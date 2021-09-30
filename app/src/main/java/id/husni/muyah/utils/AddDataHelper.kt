/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */
package id.husni.muyah.utils

import id.husni.muyah.data.source.local.entity.Campus
import id.husni.muyah.data.source.local.entity.Hospital
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.data.source.local.entity.Office
//BULK INSERT DATA
object AddDataHelper {
    fun addOffice(): ArrayList<Office> {
        val listOffice = ArrayList<Office>()
        for (i in 1..10){
            listOffice.add(Office(
                i,
                "Saya $i",
                "أنا",
                "أذهب إلى الحرم الجامعي",
                "saya pergi ke Kampus"
            ))
        }
        return listOffice
    }

    //campus
    fun addCampus(): ArrayList<Campus> {
        val listCampus = ArrayList<Campus>()
        for (i in 1..10) {
            listCampus.add(
                Campus(
                    i,
                    "Saya $i",
                    "أنا",
                    "أذهب إلى الحرم الجامعي",
                    "saya pergi ke Kampus"
                )
            )
        }
        return listCampus
    }
    //market
    fun addMarket(): ArrayList<Market> {
        val listMarket = ArrayList<Market>()
        for (i in 1..10) {
            listMarket.add(
                Market(
                    i,
                    "Saya $i",
                    "أنا",
                    "انا اذهب للسوق",
                    "Saya Pergi Ke Pasar"
                )
            )
        }
        return listMarket
    }
    //hospital
    fun addHospital(): ArrayList<Hospital> {
        val listHospital = ArrayList<Hospital>()
        for (i in 1..10) {
            listHospital.add(
                Hospital(
                    i,
                    "Saya $i",
                    "أنا",
                    "أذهب إلى المستشفى",
                    "Saya Pergi Ke Rumah Sakit"
                )
            )
        }
        return listHospital
    }
}