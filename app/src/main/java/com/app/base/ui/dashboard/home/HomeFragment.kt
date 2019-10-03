package com.app.base.ui.dashboard.home

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.base.R
import com.app.base.base_classes.BaseFragment
import com.app.base.bean.DailyModel
import com.app.base.ui.dashboard.home.adapter.DailyAdapter
import com.app.base.ui.dashboard.home.adapter.LeaderBoardAdapter
import kotlinx.android.synthetic.main.home_fragment.*

class HomeFragment : BaseFragment() {
    private lateinit var mDailyAdapter: DailyAdapter
    private lateinit var mLeaderAdapter: LeaderBoardAdapter
    private val mDailyList: ArrayList<DailyModel>? = ArrayList()

    private lateinit var mViewModel: HomeViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    @SuppressLint("WrongConstant")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        initAdapters()

        mDailyList!!.add(DailyModel("Todo 1", "10:30 PM"))
        mDailyList.add(DailyModel("Todo 2", "5:00 AM"))
        mDailyList.add(DailyModel("Todo 3", "6:00 AM"))
        mDailyList.add(DailyModel("Todo 4", "7:00 AM"))
        mDailyList.add(DailyModel("Todo 5", "2:00 AM"))
        mDailyList.add(DailyModel("Todo 6", "15:00 AM"))
        mDailyList.add(DailyModel("Todo 7", "1:00 AM"))


        mDailyAdapter = DailyAdapter(mDailyList)
        rv_daily_list.adapter = mDailyAdapter

        mLeaderAdapter = LeaderBoardAdapter(mDailyList)
        rv_leader_list.adapter = mLeaderAdapter

    }

    private fun initAdapters() {
        rv_daily_list.layoutManager = LinearLayoutManager(activity)
        rv_daily_list.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)

        rv_leader_list.layoutManager = LinearLayoutManager(activity)
        rv_leader_list.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
    }
}


