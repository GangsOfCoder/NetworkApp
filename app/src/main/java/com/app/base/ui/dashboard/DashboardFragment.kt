package com.app.base.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.app.base.R
import com.app.base.base_classes.BaseFragment
import com.app.base.ui.dashboard.contact.ContactFragment
import com.app.base.ui.dashboard.home.HomeFragment
import com.app.base.ui.dashboard.referral.ReferralFragment
import com.app.base.ui.dashboard.storage.StorageFragment
import kotlinx.android.synthetic.main.fragment_dashboard.*

class DashboardFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dashboard, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        addFragment(HomeFragment(), true, R.id.container)

        bottomNavigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_home -> {
                    addFragment(HomeFragment(), true, R.id.container)
                    true
                }

                R.id.menu_contact -> {
                    addFragment(ContactFragment(), true, R.id.container)
                    true
                }

                R.id.menu_referral -> {
                    addFragment(ReferralFragment(), true, R.id.container)
                    true
                }
                R.id.menu_database -> {
                    addFragment(StorageFragment(), true, R.id.container)
                    true
                }

                else -> false
            }
        }
    }

}
