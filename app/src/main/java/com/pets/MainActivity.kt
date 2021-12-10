package com.pets

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity() : AppCompatActivity() {

   private lateinit var switchCatButton: Button
    private lateinit var switchDogButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cat = Cat()
        val dog = Dog()
        switchCatButton = findViewById(R.id.cat_button)
        switchDogButton = findViewById(R.id.dog_button)


        switchCatButton.setOnClickListener{supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_cat,cat)
            .commit()}

        switchDogButton.setOnClickListener {supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_dog,dog)
            .commit()}



    }


    }

