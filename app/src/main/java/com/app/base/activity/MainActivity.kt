package com.app.base.activity

import android.os.Bundle
import com.app.base.R
import com.app.base.base_classes.BaseActivity
import com.app.base.ui.splash.SplashFragment

class MainActivity : BaseActivity() {
    override fun getID(): Int {
        return R.layout.activity_main
    }

    override fun iniView(savedInstanceState: Bundle?) {
        initViews()
    }


    private fun initViews() {
        addFragment(SplashFragment(), false, R.id.container_main)
    }

    override fun onBackPressed() {
        if (supportFragmentManager.backStackEntryCount > 1) {
            supportFragmentManager.popBackStack()
        } else {
            finish()
        }
    }

}
