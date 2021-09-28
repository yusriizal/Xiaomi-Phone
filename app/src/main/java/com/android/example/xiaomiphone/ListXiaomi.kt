package com.android.example.xiaomiphone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListXiaomi (private val listXiaomi: ArrayList<Xiaomi>) : RecyclerView.Adapter<ListXiaomi.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback
    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_xiaomi, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val xiaomi = listXiaomi[position]
        holder.photo.setImageResource(xiaomi.photo)
        holder.name.text = xiaomi.name
        holder.detail.text = xiaomi.detail
        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listXiaomi[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listXiaomi.size
    }

    inner class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.name_phone)
        var detail: TextView = itemView.findViewById(R.id.detail_phone)
        var photo: ImageView = itemView.findViewById(R.id.image)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Xiaomi)
    }
}