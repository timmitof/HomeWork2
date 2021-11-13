package com.timmitof.homework2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var firstNum: EditText
    lateinit var secondNum: EditText
    lateinit var symbol: EditText
    lateinit var button: Button
    lateinit var resultNum: TextView
    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNum = findViewById(R.id.firstNumber)
        secondNum = findViewById(R.id.secondNumber)
        symbol = findViewById(R.id.symbol)
        button = findViewById(R.id.resultBtn)
        resultNum = findViewById(R.id.resultNum)
        result = findViewById(R.id.result)

        button.setOnClickListener {
            resultNum.text = getResult()
            result.text = check()
        }

    }

    fun getResult() : String{
        val fNumber = firstNum.text.toString().toInt()
        val sNumber = secondNum.text.toString().toInt()
        val symb = symbol.text.toString()

        if (symb == "+"){
            return (fNumber + sNumber).toString()
        }

        if (symb == "-"){
            return (fNumber - sNumber).toString()
        }

        if (symb == "*"){
            return (fNumber * sNumber).toString()
        }

        if (symb == "/"){
            return (fNumber / sNumber).toString()
        }

        if (symb == ">"){
            return ("Вы выбрали знак '>'")
        }

        if (symb == "<"){
            return ("Вы выбрали знак '<'")
        }

        if (symb == "="){
            return ("Вы выбрали знак '='")
        }


        return "Нет результата"
    }

    fun check(): String {
        val fNumber = firstNum.text.toString().toInt()
        val sNumber = secondNum.text.toString().toInt()

        val checkMore = fNumber > sNumber
        val checkEquals = fNumber == sNumber

        if (checkEquals == true) {
            return ("Равны").toString()
        }

        if (checkMore == true) {
            return ("Первая цифра больше")
        }

        else if (checkMore == false) {
            return ("Вторая цифра больше")
        }

        return "Нет результата"
    }
}