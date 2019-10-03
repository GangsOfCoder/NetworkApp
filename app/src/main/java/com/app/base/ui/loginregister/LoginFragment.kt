package com.app.base.ui.loginregister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.app.base.R
import com.app.base.base_classes.BaseFragment
import com.app.base.ui.dashboard.DashboardFragment
import com.app.base.utils.Validations
import com.app.base.utils.social.SocialLoginManager
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : BaseFragment() {
    private var mViewModel: LoginRegisterModel? = null
    var mListeners: SocialLoginManager.SocialLoginListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProviders.of(this)[LoginRegisterModel::class.java]
        attachObservers()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        checkForPermission()
        clickListener()
    }

    private fun clickListener() {
        tv_newUser.setOnClickListener {
            replaceFragment(SignupFragment(), true, R.id.container_main)
        }

        btn_login.setOnClickListener {
            //addFragment(DashboardFragment(), false, R.id.container_main)
            if (Validations.isEmpty(et_email)) {
                if (Validations.isValidEmail(et_email)) {
                    mViewModel?.loginUser(makeLoginRequest())
                }
            }
        }

        btn_facebook.setOnClickListener {
            mListeners!!.onFacbookLogin()
        }

        btn_google.setOnClickListener {
            mListeners!!.onGoogleLogin()
        }
    }

    private fun makeLoginRequest(): HashMap<String, String> {
        val options: HashMap<String, String> = HashMap()
        options["email"] = et_email.text.toString().trim()
        options["password"] = et_password.text.toString().trim()
        options["login"] = "true"
        return options
    }

    private fun attachObservers() {
        mViewModel?.loginResponse?.observe(this, androidx.lifecycle.Observer {
            it?.let {
                showSnackBar(it.message!!)
                if (it.status!!.contains("200")) {
                    //Preferences.prefs?.saveValue("user_id",it.userInfo!!.id)
                    addFragment(DashboardFragment(), false, R.id.container_main)
                }
            }
        })

        mViewModel?.apiError?.observe(this, androidx.lifecycle.Observer {
            it?.let {
                showSnackBar(it)
            }
        })

        mViewModel?.isLoading?.observe(this, androidx.lifecycle.Observer {
            showLoading(it)
        })
    }
}