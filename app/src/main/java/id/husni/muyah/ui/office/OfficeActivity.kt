/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */
package id.husni.muyah.ui.office

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import id.husni.muyah.databinding.ActivityOfficeBinding
import id.husni.muyah.utils.AddDataHelper
import kotlinx.coroutines.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class OfficeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOfficeBinding
    private val viewModel: OfficeViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOfficeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.detailToolbar)

        val adapters = OfficeAdapter()

        supportActionBar?.apply {
            title = ""
            setDisplayHomeAsUpEnabled(true)
            setHomeButtonEnabled(true)
        }

        binding.officeRv.apply {
            adapter = adapters
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }

        lifecycleScope.launch {
            withContext(Dispatchers.Main){
                true.showProgressBar()
                viewModel.insertOffice(AddDataHelper.addOffice())
                viewModel.getAllOffice().observe(this@OfficeActivity,{ office ->
                    if (office != null) {
                        false.showProgressBar()
                        adapters.setOfficeData(office)
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
        if (item.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}