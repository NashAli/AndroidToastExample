package com.example.customtoasttest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {

    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        context = applicationContext
    }
    fun showInfoToastWithTypeface(view: View) {
        Utilities.infoToast(this, "This is a custom info Toast with custom font", Utilities.GRAVITY_TOP, ResourcesCompat.getFont(context,R.font.advent_pro_medium))

    }
    fun plainToast(view: View){
        Utilities.infoToast(this,"Plain toast - your system default",Utilities.GRAVITY_CENTER)
    }
    fun bottomToast(view: View){
        Utilities.infoToast(this,"This is a custom font bottom toast",Utilities.GRAVITY_BOTTOM,ResourcesCompat.getFont(context,R.font.advent_pro_medium),16f)
    }
    fun goToSecond(view: View){
        // TODO: 2021-01-31 add the switch to another activity
        startActivity(Intent(this, SecondAct::class.java))
    }
}