package com.example.sharedprefnav.Adapters

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.example.sharedprefnav.R
import com.example.sharedprefnav.fragments.FirstFragment
import com.example.sharedprefnav.fragments.SecondFragment
import com.example.sharedprefnav.model.Catalog

class CatalogAdapter(private val array: ArrayList<Catalog>,private val context: FragmentActivity): RecyclerView.Adapter<CatalogAdapter.CatalogViewHolder>() {
    class CatalogViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
       val name: TextView = itemView.findViewById(R.id.nameCatalog)
       val placeName: TextView = itemView.findViewById(R.id.placeCatalog)
       val image: ImageView = itemView.findViewById(R.id.imageCatalog)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CatalogViewHolder {
        return CatalogViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_catalog, parent, false))
    }

    override fun onBindViewHolder(holder: CatalogViewHolder, position: Int) {
        val item = array[position]
        holder.name.text = item.name
        holder.placeName.text = item.placeName
        val ind = array.indexOf(item)
        Glide.with(holder.itemView)
            .load(item.image)
            .into(holder.image)
        holder.itemView.setOnClickListener {
            val bundle = Bundle()
            bundle.putSerializable("key", item)
            var navController: NavController? = null
//            holder.itemView.findNavController().navigate(FragmentFirstDirections.action_FirstFragment_to_SecondFragment())
            navController = Navigation.findNavController(holder.itemView)
            navController!!.navigate(R.id.action_FirstFragment_to_SecondFragment,bundle)
//            context.supportFragmentManager.beginTransaction()
//                .replace(R.id.nav_host_fragment_content_main, SecondFragment::class.java,bundle)
//                .addToBackStack(null).commit()
        }
    }

    override fun getItemCount(): Int {
        return array.size
    }
}