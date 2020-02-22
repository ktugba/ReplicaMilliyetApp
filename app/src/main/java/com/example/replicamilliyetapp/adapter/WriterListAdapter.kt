package com.example.replicamilliyetapp.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.replicamilliyetapp.model.WriterModel

class WriterListAdapter(val writerList: List<WriterModel>) :
    RecyclerView.Adapter<WriterListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriterListViewHolder {
        return WriterListViewHolder(parent)
    }

    override fun getItemCount(): Int {
        //listenin sayısı kadar olacak.Kaç tane item olcak
        return writerList.size
    }

    override fun onBindViewHolder(holder: WriterListViewHolder, position: Int) {
        //viewholdera adapterı birleştirdiğin zaman
        //her bir item ui da gösterilmeye hazırken liste size'ı kadar çalıştırılıyor, position kaçıncı item çizilecek onun bilgisini verir
        holder.bind(writerList[position])
    }
}