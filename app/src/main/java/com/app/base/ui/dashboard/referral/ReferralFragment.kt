package com.app.base.ui.dashboard.referral

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.app.base.R
import kotlinx.android.synthetic.main.referral_fragment.*

class ReferralFragment : Fragment() {


    private lateinit var viewModel: ReferralViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.referral_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ReferralViewModel::class.java)

        val adapter = ViewPagerAdapter(this.fragmentManager!!)
        adapter.addFragment(NewReferralFragment(), getString(R.string.new_referral))
        adapter.addFragment(ExistingReferralFragment(), getString(R.string.existing_referral))
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }

}
