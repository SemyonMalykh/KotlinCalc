package com.example.semyondev.kotlincalc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.abs

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var res = "Result"

    fun split() : List<String>{
        return (res.split(" "))
    }

    fun evaluate(view : View){
        val input = split()
        when (input.get(1)){
            "+" -> res = (input.get(0).toFloat() + input.get(2).toFloat()).toString()
            "x" -> res = (input.get(0).toFloat() * input.get(2).toFloat()).toString()
            "-" -> res = (input.get(0).toFloat() - input.get(2).toFloat()).toString()
            "/" -> res = (input.get(0).toFloat() / input.get(2).toFloat()).toString()
        }
        resTextView.text = res

    }

    fun changeSign(view : View){
        if (resTextView.text.toString().toFloatOrNull() is Float){
            if(resTextView.text.toString().toFloat() > 0)
                res = "-" + resTextView.text.toString()
            if(resTextView.text.toString().toFloat() < 0)
                res = abs(resTextView.text.toString().toFloat()).toString()
            resTextView.text = res
        }
    }
    fun addDot(view : View){
        if (split().last().toIntOrNull() is Int){
            addValue(".")
        }
    }


    fun clearRes(view : View){
        res = "Result"
        resTextView.text = res
    }

    fun addOne(view : View){
        addValue("1")
    }

    fun addTwo(view : View){
        addValue("2")
    }

    fun addThree(view : View){
        addValue("3")
    }

    fun addFour(view : View){
        addValue("4")
    }

    fun addFive(view : View){
        addValue("5")
    }

    fun addSix(view : View){
        addValue("6")
    }

    fun addSeven(view : View){
        addValue("7")
    }

    fun addEight(view : View){
        addValue("8")
    }

    fun addNine(view : View){
        addValue("9")
    }

    fun addZero(view : View){
        addValue("0")
    }

    fun addSum(view : View){
        addValue(" + ")
    }

    fun addSub(view : View){
        addValue(" - ")
    }

    fun addMult(view : View){
        addValue(" x ")
    }

    fun addDiv(view : View){
        addValue(" / ")
    }


    fun addValue(value : String){
        if (res == "Result"){
            res = value
        }else{
            res += value
        }
        resTextView.text = res
    }

}
