package com.pixelfly.trukisan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class pebblesAdapter(private val pebbleList:ArrayList<pebbles>):
    RecyclerView.Adapter<pebblesAdapter.PebblesViewHolder>() {

    class PebblesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val imageView: ImageView=itemView.findViewById(R.id.pebbleListingImage)
        val textView: TextView=itemView.findViewById(R.id.pebbleListingText)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PebblesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_item,parent,false)
        return PebblesViewHolder(view)
    }

    override fun onBindViewHolder(holder: PebblesViewHolder, position: Int) {
        val pebble=pebbleList[position]
        holder.imageView.setImageResource(pebble.image)
        holder.textView.text=pebble.name
    }

    override fun getItemCount(): Int {
        return pebbleList.size
    }

}