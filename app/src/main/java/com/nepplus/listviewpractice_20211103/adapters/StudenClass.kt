package com.nepplus.listviewpractice_20211103.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.nepplus.listviewpractice_20211103.R
import com.nepplus.listviewpractice_20211103.datas.StudentData

class StudenClass (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>( mContext, resId, mList ) {

        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView
        if (tempRow == null){
            tempRow = mInflater.inflate(R.layout.student_list_item, null)
        }

    }

}