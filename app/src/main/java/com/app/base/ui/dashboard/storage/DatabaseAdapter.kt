package com.app.base.ui.dashboard.storage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.base.R
import com.app.base.bean.DatabaseModel

class DatabaseAdapter(private val DatabaseList: ArrayList<DatabaseModel>) : RecyclerView.Adapter<DatabaseAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DatabaseAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_referral_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: DatabaseAdapter.ViewHolder, position: Int) {
        //holder.bindItem(DatabaseList[position])
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(model: DatabaseModel) {
            /* itemView.tv_name.text = model.name
             itemView.tv_email.text = model.email
             itemView.tv_phone_number.text = model.phone_number*/


        }

    }
}