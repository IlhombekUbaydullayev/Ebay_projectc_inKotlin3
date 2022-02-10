package com.example.ebay_projectc_inkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_projectc_inkotlin.adapter.BraveAdapter

import com.example.ebay_projectc_inkotlin.adapter.FavoriteAdapter
import com.example.ebay_projectc_inkotlin.model.Favorite
import com.example.ebay_projectc_inkotlin.model.Favorite2

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var recyclerView2: RecyclerView
    private var nestedScrollView: NestedScrollView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        nestedScrollView = findViewById(R.id.nestedScrolView)
        recyclerView = findViewById(R.id.recyclerView)
        val manager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        recyclerView.layoutManager = manager
        recyclerView2 = findViewById(R.id.recyclerView2)
        val manager2 = GridLayoutManager(this,3)
        recyclerView2.layoutManager = manager2
        refreshAdapter(getFavourites())
        refreshAdapter2(getFavourites2())
    }

    private fun getFavourites2(): ArrayList<Favorite2> {
        val items2: ArrayList<Favorite2> = ArrayList()
        items2.add(Favorite2("Blankets",R.drawable.product8))
        items2.add(Favorite2("Heaters",R.drawable.product2))
        items2.add(Favorite2("Thermostats",R.drawable.product5))
        items2.add(Favorite2("Generators",R.drawable.product7))
        items2.add(Favorite2("Snowblowers",R.drawable.product1))
        items2.add(Favorite2("Snowblowers",R.drawable.product6))
        items2.add(Favorite2("Blankets",R.drawable.product3))
        items2.add(Favorite2("Blankets",R.drawable.product2))
        items2.add(Favorite2("Blankets",R.drawable.product5))
        items2.add(Favorite2("Blankets",R.drawable.product1))
        items2.add(Favorite2("Blankets",R.drawable.product7))
        items2.add(Favorite2("Blankets",R.drawable.product3))
        items2.add(Favorite2("Blankets",R.drawable.product6))
        items2.add(Favorite2("Blankets",R.drawable.product4))
        items2.add(Favorite2("Blankets",R.drawable.product1))
        return items2
    }

    private fun refreshAdapter2(items2: ArrayList<Favorite2>) {
        val adapter2 = BraveAdapter(this,items2)
        recyclerView2!!.adapter = adapter2
        recyclerView2.isNestedScrollingEnabled = true
    }

    fun refreshAdapter(items:ArrayList<Favorite>,) {
        val adapter = FavoriteAdapter(this,items)
        recyclerView!!.adapter = adapter
        recyclerView!!.isNestedScrollingEnabled = true
    }

    fun getFavourites(): ArrayList<Favorite> {
        val items: ArrayList<Favorite> = ArrayList()
        items.add(Favorite("Bose QuietComfort","Earbuds","$199.00","$270.00 , 29% OFF",R.drawable.product1))
        items.add(Favorite("AKG Y500 Wireless","Bluetooth On-ear","Headphones","Uni..",R.drawable.product2))
        items.add(Favorite("Bose QuietComfort","Earbuds","$199.00","$270.00 , 29% OFF",R.drawable.product3))
        items.add(Favorite("AKG Y500 Wireless","Bluetooth On-ear","Headphones","Uni..",R.drawable.product4))
        items.add(Favorite("Bose QuietComfort","Earbuds","$199.00","$270.00 , 29% OFF",R.drawable.product5))
        items.add(Favorite("AKG Y500 Wireless","Bluetooth On-ear","Headphones","Uni..",R.drawable.product6))
        items.add(Favorite("Bose QuietComfort","Earbuds","$199.00","$270.00 , 29% OFF",R.drawable.product7))
        items.add(Favorite("AKG Y500 Wireless","Bluetooth On-ear","Headphones","Uni..",R.drawable.product8))
        items.add(Favorite("Bose QuietComfort","Earbuds","$199.00","$270.00 , 29% OFF",R.drawable.product3))
        items.add(Favorite("AKG Y500 Wireless","Bluetooth On-ear","Headphones","Uni..",R.drawable.product1))
        items.add(Favorite("Bose QuietComfort","Earbuds","$199.00","$270.00 , 29% OFF",R.drawable.product6))
        items.add(Favorite("AKG Y500 Wireless","Bluetooth On-ear","Headphones","Uni..",R.drawable.product8))

        return items
    }
}