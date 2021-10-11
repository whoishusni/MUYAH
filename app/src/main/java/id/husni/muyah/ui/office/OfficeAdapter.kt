/*
 * Created by Moh Husni Mubaraq
 * Copyright (c) 2021 . All rights reserved.
 * Last Modified, Please Refer to:
 * https://github.com/whoishusni/MUYAH/commits/main
 */

package id.husni.muyah.ui.office

import android.annotation.SuppressLint
import android.content.Context
import android.speech.tts.TextToSpeech
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import id.husni.muyah.R
import id.husni.muyah.data.source.local.entity.Office
import id.husni.muyah.databinding.ItemHolderBinding
import java.util.*
import kotlin.collections.ArrayList

class OfficeAdapter : RecyclerView.Adapter<OfficeAdapter.OfficeViewHolder>() {
    private val list = ArrayList<Office>()
    @SuppressLint("NotifyDataSetChanged")
    fun setOfficeData(items: List<Office>) {
        if (items.isNullOrEmpty()) return
        list.clear()
        list.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OfficeViewHolder {
        val view = ItemHolderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OfficeViewHolder(view)
    }

    override fun onBindViewHolder(holder: OfficeViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class OfficeViewHolder(private val binding: ItemHolderBinding) :
        RecyclerView.ViewHolder(binding.root), TextToSpeech.OnInitListener {
        private var textToSpeech: TextToSpeech? = null
        fun bind(office: Office) {
            with(binding) {
                tvWord.text = office.word
                tvMean.text = office.meaning
                tvSample.text = office.example
                tvSampleMean.text = office.exampleMeaning
                btnSpeak.setOnClickListener{
                    speak(binding.root.context)
                }
            }
        }

        private fun speak(context: Context?) {
            textToSpeech = TextToSpeech(context, this)
        }

        override fun onInit(status: Int) {
            val localeArabic = Locale("ar","SA")
            if (status == TextToSpeech.SUCCESS) {
                val result = textToSpeech?.setLanguage(localeArabic)
                if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                    Toast.makeText(binding.root.context, binding.root.context.getString(R.string.error_lang), Toast.LENGTH_SHORT).show()
                }
                else{
                    textToSpeech?.speak(binding.tvMean.text.toString(), TextToSpeech.QUEUE_FLUSH, null,null)
                }
            }
        }

    }
}