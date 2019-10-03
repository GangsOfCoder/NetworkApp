package com.app.base.ui.loginregister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.base.R
import com.app.base.base_classes.BaseFragment
import com.app.base.utils.Utils
import com.app.base.utils.Validations
import kotlinx.android.synthetic.main.signup_fragment.*

class SignupFragment : BaseFragment() {
    private var mViewModel: LoginRegisterModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewModel = ViewModelProviders.of(this)[LoginRegisterModel::class.java]
        attchObservers()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.signup_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        clickListener()
    }

    private fun clickListener() {
        tv_loginHere.setOnClickListener {
            replaceFragment(LoginFragment(), true, R.id.container_main)
        }

        btn_signUp.setOnClickListener {
            if (Validations.isEmpty(et_fullname)) {
                if (Validations.isEmpty(et_email)) {
                    if (Validations.isValidEmail(et_email)) {
                        if (Validations.isEmpty(et_password)) {
                            if (Validations.isEmpty(et_cpassword)) {
                                if (Validations.isPasswordSame(et_password, et_cpassword)) {

                                    val data: HashMap<String, String> = HashMap()
                                    data.put("username", et_fullname.text.toString().trim())
                                    data.put("email", et_email.text.toString().trim())
                                    data.put("password", et_password.text.toString().trim())
                                    data.put("register", "true")
                                    val username = Utils.createRequestBodyString(et_fullname.text.toString().trim())
                                    val email = Utils.createRequestBodyString(et_email.text.toString().trim())
                                    val password = Utils.createRequestBodyString(et_password.text.toString().trim())
                                    val register = Utils.createRequestBodyString("true")
                                    mViewModel?.registerUser(username, email, password, register)

                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun attchObservers() {
        mViewModel?.registerResponse?.observe(this, androidx.lifecycle.Observer {
            it?.let {
                showSnackBar(it.message!!)
                if (it.status == 200) {
                    replaceFragment(LoginFragment(), true, R.id.container_main)
                }
            }
        })

        mViewModel?.apiError?.observe(this, androidx.lifecycle.Observer {
            it?.let {
                showSnackBar(it)
            }
        })

        mViewModel?.isLoading?.observe(this, Observer {
            showLoading(it)
        })
    }


//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (resultCode === Activity.RESULT_OK) {
//            when (requestCode) {
//                Constants.REQUEST_CAMERA -> {
//                    try {
//                        val projection = arrayOf(MediaStore.Images.Media.DATA)
//                        val cursor = activity?.contentResolver?.query(
//                            MediaStore.Images.Media.EXTERNAL_CONTENT_URI,
//                            projection, null, null, null
//                        )
//                        val column_index_data = cursor!!.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
//                        cursor.moveToLast()
//                        imageUrl = cursor.getString(column_index_data)
//                        imageUrl?.let {
//                            activity?.let { it1 ->
//                                iv_userProfile.loadImg(it, it1)
//                            }
//                        }
//                        Log.e("camera_img", "----" + imageUrl)
//                    } catch (e: Exception) {
//                        e.printStackTrace()
//                        Log.e("camera_exception", "----" + e.toString())
//                    }
//                }
//                Constants.REQUEST_GALLERY -> {
//                    val temp = activity?.let { Utils.getPathFromURI(it, data?.data) }
//                    imageUrl = temp.toString()
//                    temp?.let {
//                        activity?.let { it1 ->
//                            iv_userProfile.loadImg(it, it1)
//                        }
//                    }
//                }
//            }
//        }
//    }
}