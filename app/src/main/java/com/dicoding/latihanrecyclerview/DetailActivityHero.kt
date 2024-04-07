package com.dicoding.latihanrecyclerview

import android.app.Person
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class DetailActivityHero : AppCompatActivity() {
    companion object {
        const val EXTRA_PLAYER = "extra_player"
        const val KEY_HERO = "key_hero"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hero)


        val  imgHero : ImageView = findViewById(R.id.detail_hero)
        val tvName : TextView = findViewById(R.id.detail_textView)
        val tvDescription : TextView = findViewById(R.id.detail_textView)


    val Hero = intent.getParcelableExtra<Hero>(KEY_HERO)
        Hero?.let {
            Glide.with(this)
                .load(it.photo)
                .into(imgHero)
            tvName.text = it.name
            tvDescription.text = it.description
        }




    }
}