package com.example.ebay_projectc_inkotlin.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ebay_projectc_inkotlin.R
import com.example.ebay_projectc_inkotlin.model.Favorite
import com.example.ebay_projectc_inkotlin.model.Favorite2

class BraveAdapter(var context: Context, var items : ArrayList<Favorite2>) :
RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_brave_cold,parent,false)
        return MessageViewHolder(view)
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]


        if (holder is MessageViewHolder) {
            var tv_title = holder.tv_tittle
            var iv_image = holder.iv_image
            tv_title.text = item.tittle5
            iv_image.setImageResource(item.image2)
        }
    }

    override fun getItemCount(): Int {
        return  items.size
    }
}

class MessageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var tv_tittle : TextView
    var iv_image : ImageView

    init {
        tv_tittle = view.findViewById(R.id.tv_text)
        iv_image = view.findViewById(R.id.img)
    }
}

