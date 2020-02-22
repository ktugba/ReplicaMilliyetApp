package com.example.replicamilliyetapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.replicamilliyetapp.adapter.WriterListAdapter
import com.example.replicamilliyetapp.mock.MockList
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter'ı atıyoruz setAdapter'a karşılık geliyor
        recyclerview1.adapter = WriterListAdapter(MockList.getMockedWriterList())
        //kotlinde propertiese erişiyorduk unutma. LAyout managera erişiyoruz
        recyclerview1.layoutManager = LinearLayoutManager(this)
    }
}
