package com.pixelfly.trukisan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class pebblesListing : AppCompatActivity() {

    private lateinit var recyclerView:RecyclerView
    private lateinit var pebbleList:ArrayList<pebbles>
    private lateinit var pebblesAdapter: pebblesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebbles_listing)

        init()
    }
    private fun init() {
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=GridLayoutManager(this,2)

        pebbleList=ArrayList()
        addDataToList()

        pebblesAdapter=pebblesAdapter(pebbleList)
        recyclerView.adapter=pebblesAdapter
    }
    private fun addDataToList(){
        pebbleList.add(pebbles(R.drawable.blue,"Blue Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.lime_green,"Lime Green Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.mix_colors,"Mix Colour Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.onyx_aqua,"Onyx Aqua Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.onxy_mix,"Onyx Mix Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.onyx_pink,"Onyx Pink Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.orange,"Orange Rs.119.00"))
        pebbleList.add(pebbles(R.drawable.pink,"Pink Rs.119.00"))
    }
}