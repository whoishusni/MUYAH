/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.market

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import id.husni.muyah.databinding.ActivityMarketBinding
import id.husni.muyah.utils.AddDataHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class MarketActivity : AppCompatActivity() {
    lateinit var binding: ActivityMarketBinding
    private val viewModel: MarketViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMarketBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.detailToolbar)

        val adapters = MarketAdapter()

        supportActionBar?.apply {
            title = ""
            setDisplayHomeAsUpEnabled(true)
            setHomeButtonEnabled(true)
        }

        binding.marketRv.apply{
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = adapters
        }

        lifecycleScope.launch {
            withContext(Dispatchers.Main){
                true.showProgressBar()
                viewModel.insertMarket(AddDataHelper.addMarket())
                viewModel.getAllMarket().observe(this@MarketActivity, {market ->
                    if (market != null) {
                        false.showProgressBar()
                        adapters.setMarketData(market)
                    }
                })
            }
        }
    }

    private fun Boolean.showProgressBar() {
        if (this) {
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.progressBar.visibility = View.GONE
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}

