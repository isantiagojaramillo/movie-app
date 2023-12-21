package com.example.android_app.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.android_app.R
import com.google.android.material.floatingactionbutton.FloatingActionButton


class HomepageFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_homepage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val floatingActionButton4 = requireView().findViewById<FloatingActionButton>(R.id.floatingActionButton4)

        floatingActionButton4.setOnClickListener{
            findNavController().navigate(R.id.action_homepageFragment_to_searchFragment)
        }
    }


}