package com.example.activity_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editCarPrice = findViewById(R.id.editTextCarPrice) as EditText
        val editDownPayment = findViewById(R.id.editTextDownPayment) as EditText
        val editLoanPeriod = findViewById(R.id.editTextLoanPeriod) as EditText
        val editInterestRate = findViewById(R.id.editTextInterestRate) as EditText

        val viewLoan = findViewById(R.id.textViewLoan) as TextView
        val viewInterest = findViewById(R.id.textViewInterest) as TextView
        val viewMonthlyRepayment = findViewById(R.id.textViewMonthlyRepayment) as TextView

        val buttonForCalculate = findViewById(R.id.buttonCalculate) as Button
        val buttonForReset = findViewById(R.id.buttonReset) as Button

        buttonForCalculate.setOnClickListener(View.OnClickListener {
            View -> viewLoan.text = "Loan : " + (carPrice() - downPayment()).toString();
                    viewInterest.text = "Interest : " + ((carPrice() - downPayment()) * interestRate() * loanPeriod()).toString();
                    viewMonthlyRepayment.text = "Monthly Repayment : " + ((((carPrice() - downPayment()) + ((carPrice() - downPayment()) * interestRate() * loanPeriod())) / loanPeriod()) / 12).toString()
            }
        )

        buttonForReset.setOnClickListener(View.OnClickListener {
            View -> editCarPrice.getText().clear();
                    editDownPayment.getText().clear();
                    editLoanPeriod.getText().clear();
                    editInterestRate.getText().clear();
                    viewLoan.text = "Loan : ";
                    viewInterest.text = "Interest : ";
                    viewMonthlyRepayment.text = "Monthly Repayment : "
        })
    }

    fun carPrice(): Int
    {
        val input_CarPrice = findViewById(R.id.editTextCarPrice) as EditText
        return Integer.parseInt(input_CarPrice.text.toString())
    }

    fun downPayment(): Int
    {
        val input_DownPayment = findViewById(R.id.editTextDownPayment) as EditText
        return Integer.parseInt(input_DownPayment.text.toString())
    }

    fun interestRate(): Int
    {
        val input_InterestRate = findViewById(R.id.editTextInterestRate) as EditText
        return Integer.parseInt(input_InterestRate.text.toString())
    }

    fun loanPeriod(): Int
    {
        val input_LoadPeriod = findViewById(R.id.editTextLoanPeriod) as EditText
        return Integer.parseInt(input_LoadPeriod.text.toString())
    }
}