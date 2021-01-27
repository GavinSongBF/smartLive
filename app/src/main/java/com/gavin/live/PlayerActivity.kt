package com.gavin.live

import android.net.Uri
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import kotlinx.android.synthetic.main.activity_player_layout.*


class PlayerActivity : AppCompatActivity() {

    private lateinit var player:SimpleExoPlayer;
    private val DEFAULT_MEDIA_URI =
        "https://storage.googleapis.com/exoplayer-test-media-1/mkv/android-screens-lavf-56.36.100-aac-avc-main-1280x720.mkv"

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

        player = SimpleExoPlayer.Builder(this).build()
        PlayerVideoView.player = player;


        val mediaItem: MediaItem = MediaItem.fromUri(Uri.parse(DEFAULT_MEDIA_URI))
        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
    }

    override fun onDestroy() {
        player.release()
        super.onDestroy()
    }
}