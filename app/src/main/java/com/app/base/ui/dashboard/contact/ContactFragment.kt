package com.app.base.ui.dashboard.contact

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ScrollView
import com.app.base.R
import kotlinx.android.synthetic.main.contact_fragment.*
import kotlinx.android.synthetic.main.include_toolbar.*
import kotlinx.android.synthetic.main.storage_fragment.*

class ContactFragment : Fragment(), AdapterView.OnItemSelectedListener {


    companion object {
        fun newInstance() = ContactFragment()
    }

    var mListOfPriority = arrayOf("Priority", "Item 2", "Item 3")
    var mListOfStatus = arrayOf("Status", "Item 2", "Item 3")


    private lateinit var viewModel: ContactViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.contact_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ContactViewModel::class.java)
        tv_toolbar_title.text = getString(R.string.new_contact)

        populatePrioritySpinner()
        populateStatusSpinner()

       /* tv_status.setOnClickListener {
            val anim_industry = AnimationUtils.loadAnimation(context,R.anim.slide_up)
            tl_industry_status.startAnimation(anim_industry)
            val anim_time = AnimationUtils.loadAnimation(context,R.anim.slide_up)
            tl_contact_time.startAnimation(anim_time)
            val anim_method = AnimationUtils.loadAnimation(context,R.anim.slide_up)
            tl_contact_method.startAnimation(anim_method)

            if (tl_industry_status.visibility == View.VISIBLE) {
                tl_industry_status.visibility = View.GONE
                tl_contact_time.visibility = View.GONE
                tl_contact_method.visibility = View.GONE
            } else if (tl_industry_status.visibility == View.GONE) {

                val anim_industry = AnimationUtils.loadAnimation(context,R.anim.slide_down)
                tl_industry_status.startAnimation(anim_industry)
                val anim_time = AnimationUtils.loadAnimation(context,R.anim.slide_down)
                tl_contact_time.startAnimation(anim_time)
                val anim_method = AnimationUtils.loadAnimation(context,R.anim.slide_down)
                tl_contact_method.startAnimation(anim_method)

                tl_industry_status.visibility = View.VISIBLE
                tl_contact_time.visibility = View.VISIBLE
                tl_contact_method.visibility = View.VISIBLE

                scrollView.post(Runnable {
                    kotlin.run {
                        scrollView.fullScroll(ScrollView.FOCUS_DOWN)
                    }
                })
            }
        }*/

    }

    private fun populateStatusSpinner() {
        /*spinner_status!!.onItemSelectedListener = this
        val aa = ArrayAdapter(activity!!, R.layout.priority_spinner_item, mListOfStatus)
        aa.setDropDownViewResource(android.R.layout.simple_list_item_1)
        spinner_status!!.adapter = aa*/
    }

    private fun populatePrioritySpinner() {
        /*contact_spinner!!.onItemSelectedListener = this
        val aa = ArrayAdapter(activity!!, R.layout.priority_spinner_item, mListOfPriority)
        aa.setDropDownViewResource(android.R.layout.simple_list_item_1)
        contact_spinner!!.adapter = aa*/
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
    }


}
