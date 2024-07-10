package com.waleed0.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var addBtn: Button
    private lateinit var subBtn: Button
    private lateinit var mulBtn: Button
    private lateinit var divBtn: Button
    private lateinit var prev: TextView
    private lateinit var result: TextView
    private lateinit var textBox: EditText
    private lateinit var textBox2: EditText
    //private var res:Double? = null //result


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initUI()
        eventListener()
    }
    private fun initUI()
    {
        addBtn = findViewById(R.id.btnAdd)
        subBtn = findViewById(R.id.btnSub)
        mulBtn = findViewById(R.id.btnMul)
        divBtn = findViewById(R.id.btnDiv)
        prev = findViewById(R.id.prev)
        result = findViewById(R.id.result)
        textBox = findViewById(R.id.editText)
        textBox2 = findViewById(R.id.editText2)
    }
    private fun eventListener()
    {
        addBtn.setOnClickListener{
            val value:Double? = textBox.text.toString().toDoubleOrNull()
            val value2:Double? = textBox2.text.toString().toDoubleOrNull()
            if(value != null && value2 != null)
            {
                val res = value + value2
                val temp: String = "Result = $res"
                result.text = temp
            }
            textBox.text = null
            textBox2.text = null
        }
        subBtn.setOnClickListener {
            val value: Double? = textBox.text.toString().toDoubleOrNull()
            val value2: Double? = textBox2.text.toString().toDoubleOrNull()
            if (value != null && value2 != null) {

                val res = value - value2
                val temp: String = "Result = $res"
                result.text = temp
            }
            textBox.text = null
            textBox2.text = null
        }
        mulBtn.setOnClickListener {
            val value: Double? = textBox.text.toString().toDoubleOrNull()
            val value2: Double? = textBox2.text.toString().toDoubleOrNull()
            if (value != null && value2 != null) {

                val res = value * value2
                val temp: String = "Result = $res"
                result.text = temp
            }
            textBox.text = null
            textBox2.text = null
        }
        divBtn.setOnClickListener {
            val value: Double? = textBox.text.toString().toDoubleOrNull()
            val value2: Double? = textBox2.text.toString().toDoubleOrNull()
            if (value != null && value2 != null) {
                if (value2 == 0.0) {
                    val temp = "Result is Undefined"
                    result.text = temp
                } else {
                    val res = value / value2
                    val temp: String = "Result = $res"
                    result.text = temp
                }
            }
            textBox.text = null
            textBox2.text = null
        }
    }
//    private fun eventListener()
//    {
//        addBtn.setOnClickListener{
//            val value:Double? = textBox.text.toString().toDoubleOrNull()
//            if(value != null)
//            {
//                res = res?.let { it + value } ?: value
//                val temp: String ="Result = "+ res.toString() +" +"
//                result.text = temp
//            }
//            textBox.text = null
//        }
//        subBtn.setOnClickListener{
//            val value:Double? = textBox.text.toString().toDoubleOrNull()
//            if(value != null)
//            {
//                res = res?.let { it - value } ?: value
//                val temp: String ="Result = "+ res.toString() +" -"
//                result.text = temp
//            }
//            textBox.text = null
//        }
//        mulBtn.setOnClickListener {
//            val value: Double? = textBox.text.toString().toDoubleOrNull()
//            if (value != null) {
//                res = res?.let { it * value } ?: value
//                val temp: String ="Result = "+ res.toString() + " *"
//                result.text = temp
//            }
//            textBox.text = null
//        }
//        divBtn.setOnClickListener {
//            val value: Double? = textBox.text.toString().toDoubleOrNull()
//            if (value != null) {
//                if(value == 0.0)
//                {
//                    res = null
//                    result.text = "Undefined"
//
//                }
//                else {
//                    res = res?.let { it / value } ?: value
//                    val temp: String ="Result = "+ res.toString() + " /"
//                    result.text = temp
//                }
//            }
//            textBox.text = null
//
//        }
//    }
}
