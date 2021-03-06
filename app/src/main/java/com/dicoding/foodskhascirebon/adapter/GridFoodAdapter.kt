package com.dicoding.foodskhascirebon.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.foodskhascirebon.R
import com.dicoding.foodskhascirebon.adapter.ListFoodAdapter
import com.dicoding.foodskhascirebon.model.Food

class GridFoodAdapter(val listFoods: ArrayList<Food>) : RecyclerView.Adapter<GridFoodAdapter.GridViewHolder>() {
    private lateinit var onItemClickCallback: ListFoodAdapter.OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): GridViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_grid_food, viewGroup, false)
        return GridViewHolder(view)
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(listFoods[position].photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFoods[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listFoods.size
    }

    inner class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }
    interface OnItemClickCallback : ListFoodAdapter.OnItemClickCallback {
        override fun onItemClicked(data: Food)
    }
}