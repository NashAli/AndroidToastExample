package com.example.customtoasttest

import android.app.Activity
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.graphics.Typeface
import android.view.LayoutInflater
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat



class Utilities : AppCompatActivity(){

    companion object {
        const val GRAVITY_TOP = 48
        const val GRAVITY_CENTER = 17
        const val GRAVITY_BOTTOM = 80
        private lateinit var layoutInflater: LayoutInflater

        fun infoToast(context: Activity, message: String, position: Int) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout,(context).findViewById(R.id.custom_toast_root))
            val drawable = ContextCompat.getDrawable(context, R.drawable.round_gradient_background)
            PorterDuffColorFilter(ContextCompat.getColor(context, R.color.purple_200),PorterDuff.Mode.MULTIPLY).also { drawable?.colorFilter = it }
            layout.background = ContextCompat.getDrawable(context, R.drawable.round_gradient_background)
            layout.findViewById<TextView>(R.id.custom_toast_message).text = message
            val toast = Toast(context.applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            when (position) {
                GRAVITY_TOP -> {
                    toast.setGravity(position, 0, 120)
                }
                GRAVITY_CENTER -> {
                    toast.setGravity(position, 0, 0)
                }
                else -> {
                    toast.setGravity(position, 0, 0)
                }
            }
            toast.view = layout //setting the view of custom toast layout
            toast.show()
        }
        fun infoToast(context: Activity, message: String, position: Int, font: Typeface?) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout, (context).findViewById(R.id.custom_toast_root))
            val drawable = ContextCompat.getDrawable(context, R.drawable.round_gradient_background)
            PorterDuffColorFilter(ContextCompat.getColor(context, R.color.purple_200),PorterDuff.Mode.MULTIPLY).also { drawable?.colorFilter = it }
            layout.background = ContextCompat.getDrawable(context, R.drawable.round_gradient_background)
            layout.findViewById<TextView>(R.id.custom_toast_message).text = message
            font?.let {
                layout.findViewById<TextView>(R.id.custom_toast_message).typeface = font
            }
            val toast = Toast(context.applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            when (position) {
                GRAVITY_TOP -> {
                    toast.setGravity(position, 0, 120)
                }
                GRAVITY_CENTER -> {
                    toast.setGravity(position, 0, 0)
                }
                else -> {
                    toast.setGravity(position, 0, 0)
                }
            }
            toast.view = layout//setting the view of custom toast layout
            toast.show()
        }
        fun infoToast(context: Activity, message: String, position: Int, font: Typeface?, size: Float) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(R.layout.custom_toast_layout, (context).findViewById(R.id.custom_toast_root))
            val drawable = ContextCompat.getDrawable(context, R.drawable.round_gradient_background)
            PorterDuffColorFilter(ContextCompat.getColor(context, R.color.purple_500),PorterDuff.Mode.MULTIPLY).also { drawable?.colorFilter = it }
            layout.background = ContextCompat.getDrawable(context, R.drawable.round_gradient_background)
            layout.findViewById<TextView>(R.id.custom_toast_message).text = message
            font?.let {
                layout.findViewById<TextView>(R.id.custom_toast_message).typeface = font
                layout.findViewById<TextView>(R.id.custom_toast_message).textSize = size
            }
            val toast = Toast(context.applicationContext)
            toast.duration = Toast.LENGTH_SHORT
            when (position) {
                GRAVITY_TOP -> {
                    toast.setGravity(position, 0, 120)
                }
                GRAVITY_CENTER -> {
                    toast.setGravity(position, 0, 0)
                }
                else -> {
                    toast.setGravity(position, 0, 0)
                }
            }
            toast.view = layout//setting the view of custom toast layout
            toast.show()
        }


    }
}


