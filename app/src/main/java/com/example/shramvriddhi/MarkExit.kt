package com.example.shramvriddhi

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_mark_exit.*
import java.text.SimpleDateFormat
import java.util.Locale

class MarkExit : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mark_exit)


        val myCalendar = Calendar.getInstance()

        val datePicker = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
            myCalendar.set(Calendar.YEAR,year)
            myCalendar.set(Calendar.MONTH, month)
            myCalendar.set(Calendar.DAY_OF_MONTH,dayOfMonth)
            updateLable(myCalendar)
        }
         textView150.setOnClickListener{
             DatePickerDialog(this,datePicker, myCalendar.get(Calendar.YEAR),
                 myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show()
         }

        buttonOTPExit.setOnClickListener{
            val i = Intent(this,ModifyBasicDetailsDone::class.java).also {
                startActivity(it)
            }
        }


    }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun updateLable(myCalendar: Calendar?) {

        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat,Locale.UK)
        if (myCalendar != null) {
            textView150.setText(sdf.format(myCalendar.time))
        }

    }
}