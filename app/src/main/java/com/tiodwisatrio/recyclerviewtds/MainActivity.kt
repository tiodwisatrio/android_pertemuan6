package com.tiodwisatrio.recyclerviewtds

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>

    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var descriptionList: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageList = arrayOf(
            R.drawable.bali,
            R.drawable.bunaken,
            R.drawable.lombok,
            R.drawable.raja_ampat,
            R.drawable.toraja
        )

        titleList = arrayOf(
            "Bali",
            "Bunaken",
            "Lombok",
            "Raja Ampat",
            "Toraja"
        )

        descriptionList = arrayOf(
            "Desc Bali",
            "Desc Bunaken",
            "Desc Lombok",
            "Desc Raja Ampat",
            "Desc Toraja",
            )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        dataList = arrayListOf<DataClass>()
        getData()


    }

    private fun getData() {
        for (i in imageList.indices) {
            val dataClass = DataClass(imageList[i], titleList[i], descriptionList[i])
            dataList.add(dataClass)
        }

        recyclerView.adapter = AdapterClass(dataList)
    }
}