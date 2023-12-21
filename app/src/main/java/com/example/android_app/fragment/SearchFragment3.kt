package com.example.android_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_app.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class SearchFragment3 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val floatingActionButton12 = requireView().findViewById<FloatingActionButton>(R.id.floatingActionButton12)

        floatingActionButton12.setOnClickListener{
            findNavController().navigate(R.id.action_searchFragment3_to_profileFragment)
        }
    }
}