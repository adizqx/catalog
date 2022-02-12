package com.example.sharedprefnav.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sharedprefnav.R
import com.example.sharedprefnav.model.Catalog
import com.example.sharedprefnav.model.ImagesDetails

class DetailsAdapter(var array: ArrayList<ImagesDetails>): RecyclerView.Adapter<DetailsAdapter.DetailsViewHolder>() {
    class DetailsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imageDetails)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetailsViewHolder {
        return DetailsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_details, parent, false)
        )
    }

    override fun onBindViewHolder(holder: DetailsViewHolder, position: Int) {
        val item = array[position]
        Glide.with(holder.itemView)
            .load(item.imageDetails)
            .into(holder.image)
    }

    override fun getItemCount(): Int {
        return array.size
    }
}