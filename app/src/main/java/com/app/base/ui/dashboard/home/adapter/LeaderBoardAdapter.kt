package com.app.base.ui.dashboard.home.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.base.R
import com.app.base.bean.DailyModel

class LeaderBoardAdapter(private val leaderList: ArrayList<DailyModel>) : RecyclerView.Adapter<LeaderBoardAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_daily, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //holder.bindItem(leaderList[position])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(dailyModel: DailyModel) {
            /*itemView.tv_title.text = dailyModel.title
            itemView.tv_time.text = dailyModel.time*/
        }
    }
}
