package com.myutility

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//handle button implicit
        val btnBot : Button = findViewById(R.id.btn_bot)
        btnBot.setOnClickListener{
            val web = Intent(Intent.ACTION_VIEW,
                Uri.parse("https://dwibotapps.vercel.app/"))
            startActivity(web)
        }
//        button storage
        val btnStorage : Button = findViewById(R.id.btn_Storage)
        btnStorage.setOnClickListener{
            val web = Intent(Intent.ACTION_VIEW,
                Uri.parse("isi link anda"))
            startActivity(web)
        }
    }

}