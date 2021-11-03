package com.nepplus.listviewpractice_20211103.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.nepplus.listviewpractice_20211103.datas.StudentData

class StudenClass (
    val mContext: Context,
    val resId: Int,
    val mList: ArrayList<StudentData>) : ArrayAdapter<StudentData>( mContext, resId, mList ) {
}