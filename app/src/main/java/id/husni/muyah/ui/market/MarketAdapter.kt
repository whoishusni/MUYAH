/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.market

import android.annotation.SuppressLint
import android.content.Context
import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import id.husni.muyah.R
import id.husni.muyah.data.source.local.entity.Market
import id.husni.muyah.databinding.ItemHolderBinding
import java.util.*
import kotlin.collections.ArrayList

class MarketAdapter : RecyclerView.Adapter<MarketAdapter.ViewHolder>() {
    private val listItem = ArrayList<Market>()

    @SuppressLint("NotifyDataSetChanged")
    fun setMarketData(items: List<Market>) {
        if (items.isNullOrEmpty()) return
        listItem.clear()
        listItem.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listItem[position])
    }

    override fun getItemCount(): Int {
        return listItem.size
    }

    class ViewHolder(private val binding: ItemHolderBinding) :
        RecyclerView.ViewHolder(binding.root), TextToSpeech.OnInitListener {
        private var textToSpeech: TextToSpeech? = null
        fun bind(market: Market) {
            with(binding) {
                tvWord.text = market.word
                tvMean.text = market.meaning
                tvSample.text = market.example
                tvSampleMean.text = market.exampleMeaning
                btnSpeak.setOnClickListener {
                    speak(binding.root.context)
                }
            }
        }

        private fun speak(context: Context?) {
            textToSpeech = TextToSpeech(context, this)
        }

        override fun onInit(status: Int) {
            val localeArabic = Locale("ar", "SA")
            if (status == TextToSpeech.SUCCESS) {
                val result = textToSpeech?.setLanguage(localeArabic)
                if (result == TextToSpeech.LANG_NOT_SUPPORTED || result == TextToSpeech.LANG_MISSING_DATA) {
                    Toast.makeText(binding.root.context, binding.root.context.getString(R.string.error_lang), Toast.LENGTH_LONG).show()
                }
                else{
                    textToSpeech?.speak(binding.tvMean.text.toString(), TextToSpeech.QUEUE_FLUSH, null,null)
                }
            }
        }

    }
}