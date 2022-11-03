package com.example.lk06psi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ListPahlawanAdapter(val listPahlawan: ArrayList<Pahlawan>): RecyclerView.Adapter<ListPahlawanAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_pahlawan,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.itemView.apply{
            var photo = findViewById<ImageView>(R.id.imagePahlawan)
            var namaPahlawan = findViewById<TextView>(R.id.tvNamaPahlawan)
            var deskripsiPahlawan = findViewById<TextView>(R.id.tvDeskripsiPahlawan)
            photo.setImageResource(listPahlawan[position].photo)
            photo.setOnClickListener {
                Toast.makeText(context,listPahlawan[position].namaPahlawan,Toast.LENGTH_SHORT).show()
            }
            namaPahlawan.text = listPahlawan[position].namaPahlawan
            deskripsiPahlawan.text = listPahlawan[position].deskripsiPahlawan
        }
    }

    override fun getItemCount(): Int {
        return listPahlawan.size?:0
    }

}