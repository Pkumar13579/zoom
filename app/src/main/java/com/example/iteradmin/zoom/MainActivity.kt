package com.example.iteradmin.zoom

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.image)
        val zoomin = findViewById<Button>(R.id.zoomin)
        val zoomout = findViewById<Button>(R.id.zoomout)

        zoomin.setOnClickListener {
            val x:Float= image.scaleX
            val y:Float = image.scaleY

            image.scaleX=x+1
            image.scaleY=x+1
        }
        zoomout.setOnClickListener {
            val x:Float = image.scaleX
            val y:Float = image.scaleY
            if(x>1 && y>1){
            image.scaleX=x-1
            image.scaleY=x-1}
        }

    }
}
