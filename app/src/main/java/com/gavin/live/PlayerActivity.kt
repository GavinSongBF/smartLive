package com.gavin.live

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_player_layout.*

class PlayerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player_layout)

        init();
    }

    private fun init() {
        PlayerBtn.setOnClickListener {
            var toastStri = "aaa";
            if (it != null){
                toastStri = it.id.toString();
            }
            Toast.makeText(
                this@PlayerActivity,
                toastStri,
                Toast.LENGTH_SHORT
            ).show();
        }
    }
}