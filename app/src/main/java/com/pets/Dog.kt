package com.pets

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Dog : Fragment() {
    lateinit var  woofButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dog, container, false)
        woofButton = view.findViewById(R.id.woof_button)
        woofButton.setOnClickListener {val player= MediaPlayer.create(context, R.raw.dog_voice)
            player.start()}

        return view
    }

}