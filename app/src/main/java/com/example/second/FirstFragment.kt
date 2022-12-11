package com.example.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FirstFragment : Fragment(R.layout.fragment_first) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.switchToSecondButton)
        button.setOnClickListener {
            (requireActivity() as MainActivity).switchToSecondFragment()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = FirstFragment()
    }
}