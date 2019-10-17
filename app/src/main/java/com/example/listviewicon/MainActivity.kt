package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.model.bahasa
import com.example.listviewicon.model.bahasadata

class MainActivity : AppCompatActivity() {

    private lateinit var rvbahasa: RecyclerView
    private var list: ArrayList<bahasa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvbahasa = findViewById(R.id.rv_bahasa)
        rvbahasa.setHasFixedSize(true)
        list.addAll(bahasadata.listbahasa)
        showFoodList()


    }

    private fun showFoodList() {
        rvbahasa.layoutManager = LinearLayoutManager(this)
        val listBahasaAdapter = ListBahasaAdapter(list)
        rvbahasa.adapter = listBahasaAdapter
    }
}
