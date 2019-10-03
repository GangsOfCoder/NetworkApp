package com.app.base.ui.dashboard.storage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.base.R
import com.app.base.bean.DatabaseModel
import kotlinx.android.synthetic.main.storage_fragment.*

class StorageFragment : Fragment(), AdapterView.OnItemSelectedListener {
    private lateinit var mDatabaseAdapter: DatabaseAdapter
    private val mDatabaseList: ArrayList<DatabaseModel>? = ArrayList()
    companion object {
        fun newInstance() = StorageFragment()
    }

    var mListOfIndustry = arrayOf("Industry A", "Industry B", "Industry C")
    var mListOfStatus = arrayOf("Status A", "Status B", "Status C")
    var mListOfPriority = arrayOf("Priority A", "Priority B", "Priority C")

    private lateinit var viewModel: StorageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.storage_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(StorageViewModel::class.java)

        populateIndustrySpinner()
        populateStatusSpinner()
        populatePrioritySpinner()

        mDatabaseList!!.add(DatabaseModel("elli","elli@gmail.com","985682451"))
        mDatabaseList.add(DatabaseModel("janni","janni@gmail.com","9875842613"))
        mDatabaseList.add(DatabaseModel("hater","ghater@gmail.com","8654546551"))
        mDatabaseList.add(DatabaseModel("harder","hardwe@GMAIL.COM","8787454956"))

        mDatabaseAdapter = DatabaseAdapter(mDatabaseList)
        db_recyclerview.adapter = mDatabaseAdapter

        db_recyclerview.layoutManager = LinearLayoutManager(activity)
        db_recyclerview.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
    }

    private fun populatePrioritySpinner() {
        industry_spinner!!.onItemSelectedListener = this
        val aa = ArrayAdapter(activity!!, R.layout.priority_spinner_item, mListOfIndustry)
        aa.setDropDownViewResource(android.R.layout.simple_list_item_1)
        industry_spinner!!.adapter = aa
    }

    private fun populateStatusSpinner() {
        status_spinner!!.onItemSelectedListener = this
        val aa = ArrayAdapter(activity!!, R.layout.priority_spinner_item, mListOfStatus)
        aa.setDropDownViewResource(android.R.layout.simple_list_item_1)
        status_spinner!!.adapter = aa
    }

    private fun populateIndustrySpinner() {
        priority_spinner!!.onItemSelectedListener = this
        val aa = ArrayAdapter(activity!!, R.layout.priority_spinner_item, mListOfPriority)
        aa.setDropDownViewResource(android.R.layout.simple_list_item_1)
        priority_spinner!!.adapter = aa
    }
    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

    }
}
