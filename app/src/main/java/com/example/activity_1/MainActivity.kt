package com.example.activity_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener()
        {
            val val1:String = editTextCarPrice.text.toString()
            val val2:String = editTextDownPayment.text.toString()
//            val val3:String = editTextInterestRate.text.toString()
//            val val4:String = editTextLoanPeriod.text.toString()

            val result1:Int = carLoan(val1, val2)
            textViewLoan.setText(result1)

//            val result2:Int = interest(val1, val2, val3, val4)
//            textViewInterest.setText(result2)
//
//            val result3:Int = monthlyRepayment(val1, val2, val3, val4)
//            textViewMonthlyRepayment.setText(result3)
//            interest()
        }

//        buttonReset.setOnClickListener()
//        {
//
//        }
    }

    private fun carLoan(val1:String, val2:String): Int
    {
        val a:Int = Integer.parseInt(val1)
        val b:Int = Integer.parseInt(val2)

        //val sub:Int = a-b
        return a-b
    }

//    private fun interest(val1:String, val2:String, val3:String, val4:String): Int
//    {
//        val a:Int = Integer.parseInt(val1)
//        val b:Int = Integer.parseInt(val2)
//        val c:Int = Integer.parseInt(val3)
//        val d:Int = Integer.parseInt(val4)
//
//        val sub:Int = (a-b)*c*d
//        return sub
//    }

//    private fun monthlyRepayment(val1:String, val2:String, val3:String, val4:String): Int
//    {
//        val a:Int = Integer.parseInt(val1)
//        val b:Int = Integer.parseInt(val2)
//        val c:Int = Integer.parseInt(val3)
//        val d:Int = Integer.parseInt(val4)
//
//        val sub:Int = ((a-b)+((a-b)*c*d))/d/12
//        return sub
//    }
}

