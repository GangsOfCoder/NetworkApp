package com.app.base.ui.dashboard.referral

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.base.R
import com.app.base.bean.DailyModel
import kotlinx.android.synthetic.main.item_referral_list.view.*
import android.graphics.Color
import java.util.*
import kotlin.collections.ArrayList


class ExistingAdapter(private val dailyList: ArrayList<DailyModel>) : RecyclerView.Adapter<ExistingAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_referral_list, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val rnd = Random()
        val color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
        //holder.itemView.view_line.setBackgroundColor(color)

        // holder.bindItem(dailyList[position])
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(model: DailyModel) {

        }
    }
}