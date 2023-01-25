package com.example.shramvriddhi

import android.app.DatePickerDialog
import android.content.Intent
import android.icu.util.Calendar
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_mark_exit.*
import kotlinx.android.synthetic.main.activity_modify_basic_details.*
import java.text.SimpleDateFormat
import java.util.*

class ModifyBasicDetails : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modify_basic_details)


        val myCalendar2 = Calendar.getInstance()

        val datePicker2 = DatePickerDialog.OnDateSetListener { view, year1, month1, dayOfMonth1 ->
            myCalendar2.set(Calendar.YEAR,year1)
            myCalendar2.set(Calendar.MONTH, month1)
            myCalendar2.set(Calendar.DAY_OF_MONTH,dayOfMonth1)
            updateLable2(myCalendar2)
        }


        textView154.setOnClickListener{
            DatePickerDialog(this,datePicker2, myCalendar2.get(Calendar.YEAR),
                myCalendar2.get(Calendar.MONTH),myCalendar2.get(Calendar.DAY_OF_MONTH)).show()
        }










        ivBackModifyDetails3.setOnClickListener {
            finish()
        }

        btnSubmitbasicDetails.setOnClickListener{
            val i = Intent(this,ModifyBasicDetailsDone::class.java).also {
                startActivity(it)
            }
         }



     }

    @RequiresApi(Build.VERSION_CODES.N)
    private fun updateLable2(myCalendar: Calendar?) {
        val myFormat = "dd-MM-yyyy"
        val sdf = SimpleDateFormat(myFormat, Locale.UK)
        if (myCalendar != null) {
            textView154.setText(sdf.format(myCalendar.time))
        }
    }
}
