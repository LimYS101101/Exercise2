package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener{
            var weight:Double = editTextWeight.text.toString().toDouble()
            var height:Double = editTextHeight.text.toString().toDouble()

            var calculate:Double = weight / ((height * height)/100)

            var BMI:Double = (calculate*100)

            if(BMI <18.5)
            {
                textViewBMI.text = "BMI: %.2f Underweight".format(BMI)
                imageViewProfile.setImageResource(R.drawable.under)
            }
            else if (BMI >= 18.5 && BMI <=24.9){
                textViewBMI.text = "BMI: %.2f Normal".format(BMI)
                imageViewProfile.setImageResource(R.drawable.normal)
            }else if (BMI >24.9){
                textViewBMI.text = "BMI: %.2f Overweight".format(BMI)
                imageViewProfile.setImageResource(R.drawable.over)

            }

        }

        buttonReset.setOnClickListener{
            editTextWeight.text = null
            editTextHeight.text = null

            textViewBMI.text = "BMI: "
            imageViewProfile.setImageResource(R.drawable.empty)
        }


    }
}
