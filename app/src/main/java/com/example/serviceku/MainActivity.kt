package com.example.services

import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.serviceku.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button instagram jika diklik akan ke hal instagram.com
        btn_ig.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://instagram.com"))
            startActivity(i)
        })

        //button twitter jika diklik akan ke hal twitter.com
        btn_twitter.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("http://twitter.com"))
            startActivity(i)
        })
        //mendeklarasikan variabel media playerdan memanggil mp3
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this, R.raw.remix)

        //button play mediaplayer
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }
        //button pause mediaplayer
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }
        //button stop mediaplayer
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
