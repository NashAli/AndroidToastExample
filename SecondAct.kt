package com.example.customtoasttest

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat

class SecondAct: AppCompatActivity() {
    lateinit var context: Context
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_act)
        context = applicationContext
        Utilities.infoToast(this, "Hello World!!!",
                Utilities.GRAVITY_TOP, ResourcesCompat.getFont(context,R.font.architects_daughter))
    }
    fun showInfoToastWithTypeface(view: View) {
        Utilities.infoToast(this, "Another custom font and a smaller size....",
                Utilities.GRAVITY_BOTTOM, ResourcesCompat.getFont(context,R.font.limelight),12f)
    }
    fun showInfoToastWithTypefaceBig(view: View) {
        Utilities.infoToast(this, "Another custom font in a larger size....",
                Utilities.GRAVITY_CENTER, ResourcesCompat.getFont(context,R.font.limelight),20f)
    }
}