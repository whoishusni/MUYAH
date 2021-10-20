/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.main

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.MobileAds
import id.husni.muyah.R
import id.husni.muyah.databinding.ActivityMainBinding
import id.husni.muyah.ui.campus.CampusActivity
import id.husni.muyah.ui.hospital.HospitalActivity
import id.husni.muyah.ui.market.MarketActivity
import id.husni.muyah.ui.office.OfficeActivity
import id.husni.muyah.ui.search.SearchActivity

class MainActivity : AppCompatActivity(), View.OnClickListener, SearchView.OnQueryTextListener {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        MobileAds.initialize(this){}
        val searchManager = getSystemService(Context.SEARCH_SERVICE)
        if (searchManager != null) {
            binding.svWord.apply {
                queryHint = getString(R.string.search)
            }
            binding.svWord.setOnQueryTextListener(this)
        }


        val adRequest = AdRequest.Builder().build()
        binding.adsBanner.loadAd(adRequest)

        binding.cvOffice.setOnClickListener(this)
        binding.cvCampus.setOnClickListener(this)
        binding.cvMarket.setOnClickListener(this)
        binding.cvHospital.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.cvOffice -> {
                startActivity(Intent(this, OfficeActivity::class.java))
            }
            R.id.cvCampus -> {
                startActivity(Intent(this, CampusActivity::class.java))
            }
            R.id.cvMarket -> {
                startActivity(Intent(this, MarketActivity::class.java))
            }
            R.id.cvHospital -> {
                startActivity(Intent(this, HospitalActivity::class.java))
            }
        }

    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        val intentSearch = Intent(this, SearchActivity::class.java)
        intentSearch.putExtra(SearchActivity.SEARCH_EXTRA, query)
        startActivity(intentSearch)
        return true
    }

    override fun onQueryTextChange(newText: String?): Boolean {
        return false
    }

}