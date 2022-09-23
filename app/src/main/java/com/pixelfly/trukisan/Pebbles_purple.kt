package com.pixelfly.trukisan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class Pebbles_purple : AppCompatActivity() {

    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebbles_purple)

        var imageView: ImageView
        var pre: Button
        var nxt: Button
        var i:Int=0
        imageView=findViewById(R.id.imageView2)
        pre=findViewById(R.id.button1)
        nxt=findViewById(R.id.button2)
        var images= arrayListOf<Int>(R.drawable.tkb1,R.drawable.tkb2,R.drawable.tkb3,R.drawable.tkb4)
        pre.setOnClickListener(View.OnClickListener {
            if(i>0){
                i--
                imageView.setImageResource(images[i])
            }
            else{
                Toast.makeText(applicationContext," ", Toast.LENGTH_SHORT)
                i=0
            }
        })
        nxt.setOnClickListener(View.OnClickListener {
            if(i<2){
                i++
                imageView.setImageResource(images[i])
            }
            else{
                Toast.makeText(applicationContext," ", Toast.LENGTH_SHORT)
                i=4
            }
        })



        button = findViewById(R.id.button3)


        button.setOnClickListener{


            val intent= Intent()
            intent.action = Intent.ACTION_SEND

            // intent.putExtra("Share this",url)
            intent.putExtra(Intent.EXTRA_TEXT, "https://trukisan.com/product/pebbles-sky-blue/")
            intent.type= "text/plain"
            val chooser= Intent.createChooser(intent,"Share using")
            startActivity(chooser)
        }


    }
}