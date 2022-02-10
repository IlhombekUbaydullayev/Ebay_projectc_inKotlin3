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

class FavoriteAdapter(var context: Context, var items : ArrayList<Favorite>) :
RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_found_favourite,parent,false)
        return StoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is StoryViewHolder) {
            var tv_title = holder.tv_title
            var tv_title2 = holder.tv_title2
            var tv_title3 = holder.tv_title3
            var tv_title4 = holder.tv_title4
            var iv_image = holder.iv_image
            iv_image.setImageResource(item.image)
            tv_title.text = item.tittle
            tv_title2.text = item.tittle2
            tv_title3.text = item.tittle3
            tv_title4.text = item.tittle4
        }
    }

    override fun getItemCount(): Int {
        return  items.size
    }
}
class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    var tv_title : TextView
    var tv_title2 : TextView
    var tv_title3 : TextView
    var tv_title4 : TextView
    var iv_image : ImageView

    init {
        tv_title = view.findViewById(R.id.iv_title)
        tv_title2 = view.findViewById(R.id.iv_title2)
        tv_title3 = view.findViewById(R.id.iv_title3)
        tv_title4 = view.findViewById(R.id.iv_title4)
        iv_image = view.findViewById(R.id.iv_image)
    }
}
