package com.example.calculateappactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnum1: EditText
    lateinit var etnum2: EditText
    lateinit var btnadd: Button
    lateinit var btnsubract: Button
    lateinit var btnmultiply: Button
    lateinit var btndivide: Button
    lateinit var tvresullt: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.btnadd)
        btndivide = findViewById(R.id.btndivide)
        btnmultiply = findViewById(R.id.btnmultiply)
        btnsubract = findViewById(R.id.btnsubtract)
        etnum1 = findViewById(R.id.etnum1)
        etnum2 = findViewById(R.id.etnum2)
        tvresullt = findViewById(R.id.tvresult)

        btnadd.setOnClickListener {
            var numbers1= etnum1.text.toString().toInt()
            var numbers2= etnum2.text.toString().toInt()
            result(numbers1,numbers2)
        }





    }

     fun result(numbers1: Int, numbers2: Int) {
         var x=numbers1
         var total=x+numbers2
         tvresullt.text=total.toString()

    }

}