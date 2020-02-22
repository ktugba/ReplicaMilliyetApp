package com.example.replicamilliyetapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.replicamilliyetapp.R
import com.example.replicamilliyetapp.model.WriterModel

class WriterListViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        LayoutInflater.from(container.context).inflate
            (
            R.layout.adapter_item_list,
            container,
            false
        )
    ) {

    val imgProfilePhoto: ImageView = itemView.findViewById(R.id.imgProfilePhoto)
    val txtWriterName: TextView = itemView.findViewById(R.id.txtWriterName)
    val txtWriterEmail: TextView = itemView.findViewById(R.id.txtWriterEmail)
    val txtTitle: TextView = itemView.findViewById(R.id.txtTitle)

    fun bind(writerModel: WriterModel) {

        txtWriterName.text = writerModel.writerName
        txtWriterEmail.text = writerModel.writerEmail
        txtTitle.text = writerModel.writerTitle
    }
}



