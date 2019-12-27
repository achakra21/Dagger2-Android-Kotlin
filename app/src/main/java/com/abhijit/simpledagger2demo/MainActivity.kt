package com.abhijit.simpledagger2demo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.abhijit.simpledagger2demo.application.Main2Activity
import com.abhijit.simpledagger2demo.component.DaggerMagicBox

import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car
    @Inject
    lateinit var info:Info
    @Inject @field:Named("ABHIJIT")
    lateinit var  infoAbhiit :Info
    @Inject @field:Named("HELLO")
    lateinit var infoHello:Info




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMagicBox.create().poke(this)


        textView.text = "${infoAbhiit.text}"+" "+"${infoHello.text}"+" "+info.text+" "+car.isCarReady
        btnGo.setOnClickListener(View.OnClickListener {

            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(intent)
        })
    }
}
