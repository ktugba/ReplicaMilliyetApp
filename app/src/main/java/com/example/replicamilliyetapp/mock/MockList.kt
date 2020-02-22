package com.example.replicamilliyetapp.mock

import com.example.replicamilliyetapp.model.WriterModel
import java.util.*


object MockList {

    fun getMockedWriterList(): List<WriterModel> {

        val writerModel = WriterModel(
            "asasas",
            "Neinbabe",
            "neinbabe@gmail.com",
            "Android Geliştirme"

        )

        val writeList: ArrayList<WriterModel> = ArrayList()

        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)
        writeList.add(writerModel)

        return writeList

    }
}