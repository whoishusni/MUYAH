/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.husni.muyah.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {
    lateinit var binding: ActivitySearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.detailToolbar)
    }
}