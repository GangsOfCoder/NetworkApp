package com.app.base.ui.dashboard.referral


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.base.R
import com.app.base.base_classes.BaseFragment
import com.app.base.bean.DailyModel
import com.app.base.ui.dashboard.home.adapter.DailyAdapter
import kotlinx.android.synthetic.main.fragment_existing_referral.*


class ExistingReferralFragment : BaseFragment() {

    private lateinit var mExistingAdapter: ExistingAdapter
    private val mDailyList: ArrayList<DailyModel>? = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_existing_referral, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initAdapters()
    }

    private fun initAdapters() {
        rv_existing.layoutManager = LinearLayoutManager(activity)
        rv_existing.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        mExistingAdapter = ExistingAdapter(mDailyList!!)
        rv_existing.adapter = mExistingAdapter
    }
}
