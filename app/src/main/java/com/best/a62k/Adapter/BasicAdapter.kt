package com.best.a62k.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.best.a62k.R
import com.best.a62k.User

class BasicAdapter(var list: ArrayList<User>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_basicadapter, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = list[position]
        if (holder is CustomViewHolder) {
            val a = holder.a
            val b = holder.b
            a.setImageResource(user.imageView)
            b.text = user.title
        }
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val a: ImageView = itemView.findViewById(R.id.item_image)
        val b: TextView = itemView.findViewById(R.id.item_title)
    }
}