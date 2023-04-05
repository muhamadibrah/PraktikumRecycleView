package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMangaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_manga)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val manga = intent.getParcelableExtra<Manga>(MainActivity.INTENT_PARCELABLE)

        val imgManga = findViewById<ImageView>(R.id.img_item_photo)
        val nameManga = findViewById<TextView>(R.id.tv_item_name)
        val descManga = findViewById<TextView>(R.id.tv_item_description)

        imgManga.setImageResource(manga?.imgManga!!)
        nameManga.text = manga.nameManga
        descManga.text = manga.descManga


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}