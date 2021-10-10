/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.hospital

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import id.husni.muyah.databinding.ActivityHospitalBinding
import id.husni.muyah.utils.AddDataHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.koin.androidx.viewmodel.ext.android.viewModel

class HospitalActivity : AppCompatActivity() {
    lateinit var binding: ActivityHospitalBinding
    private val viewModel: HospitalViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHospitalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.detailToolbar)

        val adapters = HospitalAdapter()
        supportActionBar?.apply {
            title = ""
            setDisplayHomeAsUpEnabled(true)
            setHomeButtonEnabled(true)
        }

        binding.hospitalRv.apply{
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = adapters
        }

        lifecycleScope.launch {
            withContext(Dispatchers.Main){
                true.showProgressBar()
                viewModel.insertHospital(AddDataHelper.addHospital())
                viewModel.getAllHospital().observe(this@HospitalActivity, { hospital ->
                    if (hospital != null) {
                        false.showProgressBar()
                        adapters.setHospitalData(hospital)
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

