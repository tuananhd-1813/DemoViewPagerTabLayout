package com.asterisk.tuandao.demoviewpagertablayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WelcomeAdapter(var listContents: List<WelcomeContent>): RecyclerView.Adapter<WelcomeAdapter.WelComeViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WelComeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return WelComeViewHolder(view)
    }

    override fun getItemCount() = listContents.size

    override fun onBindViewHolder(holder: WelComeViewHolder, position: Int) {
        val welcomeContent = listContents[position]
        holder.bindData(welcomeContent)
    }


    class WelComeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textUserName: TextView
        val textDateOfBirth: TextView

        init {
            textUserName = itemView.findViewById(R.id.textViewUserName)
            textDateOfBirth = itemView.findViewById(R.id.textDateOfBirth)
        }

        fun bindData(welcomeContent: WelcomeContent) {
            textUserName.text = welcomeContent.title
            textDateOfBirth.text = welcomeContent.content
        }
    }
}
