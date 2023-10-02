package com.aditya.recycler_view_test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlin.coroutines.coroutineContext

class ContactAdapter(private val listOfContact:List<contact>) :RecyclerView.Adapter<ContactAdapter.contactViewHolder>(){

    class contactViewHolder(
        view: View
    ):RecyclerView.ViewHolder(view) {
        val image :ImageView = view.findViewById(R.id.image)
        val text1 : TextView= view.findViewById(R.id.txt1)
        val text2: TextView= view.findViewById(R.id.txt2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): contactViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_rv_item,parent,false)
        return contactViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfContact.size

    }

    override fun onBindViewHolder(holder: contactViewHolder, position: Int) {
        holder.image.setImageResource(listOfContact[position].image)
        holder.text1.text = listOfContact[position].txt1
        holder.text2.text = listOfContact[position].txt2

    }
}