/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.campus

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import id.husni.muyah.databinding.ActivityCampusBinding
import id.husni.muyah.ui.adapter.CampusAdapter
import id.husni.muyah.utils.AddDataHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class CampusActivity : AppCompatActivity() {
    lateinit var binding: ActivityCampusBinding
    private val viewModel: CampusViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCampusBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.detailToolbar)

        val adapters = CampusAdapter()
        supportActionBar?.apply {
            //TODO : Butuh perbaikan / opsi lain untuk hide title
            title = ""
            setDisplayHomeAsUpEnabled(true)
            setHomeButtonEnabled(true)
        }
        binding.campusRv.apply {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = adapters
        }
        lifecycleScope.launch {
            withContext(Dispatchers.Main){
                true.showProgressbar()
                viewModel.insertCampus(AddDataHelper.addCampus())
                viewModel.getAllCampus().observe(this@CampusActivity, {campus ->
                    if (campus != null) {
                        false.showProgressbar()
                        adapters.setCampusData(campus)
                    }
                })
            }
        }

    }

    private fun Boolean.showProgressbar() {
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
