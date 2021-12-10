package com.pets

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Cat : Fragment() {

    lateinit var  meowButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_cat, container, false)
        meowButton = view.findViewById(R.id.meow_botton)
        meowButton.setOnClickListener {val player= MediaPlayer.create(context, R.raw.cat_voice)
            player.start()}

        return view
    }


    }
