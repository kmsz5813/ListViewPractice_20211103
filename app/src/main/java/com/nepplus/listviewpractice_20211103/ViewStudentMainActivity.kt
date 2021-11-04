package com.nepplus.listviewpractice_20211103

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.listviewpractice_20211103.datas.StudentData
import kotlinx.android.synthetic.main.activity_view_student_main.*

class ViewStudentMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_student_main)

//        통째로 넘겨준 studentData를 intent에서 받아오자.
//        Serializable을 받아오고있다. StudentData가 아님. => StudentData로 복원해야함.

        val studentData = intent.getSerializableExtra("student") as StudentData

        txtName.text = studentData.name
        txtAge.text = "${studentData.getAge(2021)}세"
        txtAddress.text = studentData.address

    }
}