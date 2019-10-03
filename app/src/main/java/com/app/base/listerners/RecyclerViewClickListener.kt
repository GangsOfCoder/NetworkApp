package com.app.base.listerners

import android.view.View

interface RecyclerViewClickListener {
    fun onClick(view: View, position: Int, url: String)
}