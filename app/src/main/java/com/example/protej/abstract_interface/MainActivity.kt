package com.example.protej.abstract_interface

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

import com.example.protej.abstract_interface.Abstract.Addition
import com.example.protej.abstract_interface.Abstract.Division

import com.example.protej.abstract_interface.Abstract.Multiply
import com.example.protej.abstract_interface.Abstract.Subtraction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val Add=findViewById<Button>(R.id.btnAdd)
        val Sub=findViewById<Button>(R.id.btnSub)
        val Mul=findViewById<Button>(R.id.btnMul)
        val Div=findViewById<Button>(R.id.btnDiv)

        val number1=findViewById<EditText>(R.id.etNum1)
        val number2=findViewById<EditText>(R.id.etNum2)

        val result=findViewById<TextView>(R.id.tvResult)

result.setOnClickListener {
    val intent= Intent(this, MainActivity2::class.java)
    startActivity(intent)
}

        Add.setOnClickListener {
            val num1=number1.text.toString().toIntOrNull()?:0
            val num2=number2.text.toString().toIntOrNull()?:0
          val resultt= Addition().calculate(num1,num2)

            result.text=resultt.toString()
        }
        Sub.setOnClickListener {
            val num1=number1.text.toString().toIntOrNull()?:0
            val num2=number2.text.toString().toIntOrNull()?:0
           val resultt= Subtraction().calculate(num1,num2)
            result.text=resultt.toString()
        }
        Mul.setOnClickListener {
            val num1=number1.text.toString().toIntOrNull()?:0
            val num2=number2.text.toString().toIntOrNull()?:0
           val resultt= Multiply().calculate(num1,num2)
            result.text=resultt.toString()
        }

        Div.setOnClickListener {
            val num1=number1.text.toString().toIntOrNull()?:0
            val num2=number2.text.toString().toIntOrNull()?:0
           val resultt= Division().calculate(num1,num2)
            result.text=resultt.toString()
        }




        Addition().calculate(5,5)
        Log.d("TAG",  "${Addition().calculate(5,5)}")

        Subtraction().calculate(6,3)

        Log.d("TAG",  "${Subtraction().calculate(6,5)}")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}