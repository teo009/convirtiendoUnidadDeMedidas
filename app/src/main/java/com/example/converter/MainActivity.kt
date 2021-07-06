package com.example.converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun Calcular(view: View) {

        }
    }

    fun Funciona(view: View) {
        var btnCon = findViewById<Button>(R.id.btnConvert)
        var radio1 = findViewById<RadioButton>(R.id.rbMmToCm)
        var radio2 = findViewById<RadioButton>(R.id.rbMmToMt)
        var radio3 = findViewById<RadioButton>(R.id.rbMmToKm)
        var radio4 = findViewById<RadioButton>(R.id.rbCmToMm)
        var radio5 = findViewById<RadioButton>(R.id.rbMtToMm)
        var radio6 = findViewById<RadioButton>(R.id.rbKmToMm)

        if (radio1.isChecked) {
            btnCon.setOnClickListener{
                var textv = findViewById<TextView>(R.id.txtvResult)
                var etxt = findViewById<EditText>(R.id.etxtConvertValue)
                var valueConvert = etxt.text.toString()
                var valueConverted = etxt.text.toString().toInt()
                var result = (valueConverted/10.000)
                textv.setText(result.toString())
            }
        } else if (radio2.isChecked == true) {
            btnCon.setOnClickListener{
                var textv = findViewById<TextView>(R.id.txtvResult)
                var etxt = findViewById<EditText>(R.id.etxtConvertValue)
                var valueConvert = etxt.text.toString()
                var valueConverted = etxt.text.toString().toInt()
                var result = (valueConverted/1000.0)
                textv.setText(result.toString())
            }
        } else if (radio3.isChecked == true) {
            btnCon.setOnClickListener{
                var textv = findViewById<TextView>(R.id.txtvResult)
                var etxt = findViewById<EditText>(R.id.etxtConvertValue)
                var valueConvert = etxt.text.toString()
                var valueConverted = etxt.text.toString().toInt()
                var result = (valueConverted/1000000)
                textv.setText(result.toString())
            }
        } else if (radio4.isChecked == true) {
            btnCon.setOnClickListener{
                var textv = findViewById<TextView>(R.id.txtvResult)
                var etxt = findViewById<EditText>(R.id.etxtConvertValue)
                var valueConvert = etxt.text.toString()
                var valueConverted = etxt.text.toString().toInt()
                var result = (valueConverted/0.10000)
                textv.setText(result.toString())
            }
        } else if (radio5.isChecked == true) {
            btnCon.setOnClickListener{
                var textv = findViewById<TextView>(R.id.txtvResult)
                var etxt = findViewById<EditText>(R.id.etxtConvertValue)
                var valueConvert = etxt.text.toString()
                var valueConverted = etxt.text.toString().toInt()
                var result = (valueConverted/0.0010000)
                textv.setText(result.toString())
            }
        } else if (radio6.isChecked == true) {
            btnCon.setOnClickListener{
                var textv = findViewById<TextView>(R.id.txtvResult)
                var etxt = findViewById<EditText>(R.id.etxtConvertValue)
                var valueConvert = etxt.text.toString()
                var valueConverted = etxt.text.toString().toInt()
                var result = (valueConverted/0.0000010000)
                textv.setText(result.toString())
            }
        }
    }
}