package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController


class RecogerDato : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recoger_dato, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bundle= bundleOf("nombre" to view.findViewById<EditText>(R.id.textview_recogerdato).text.toString())
        view.findViewById<Button>(R.id.button_recogerdato_enviar).setOnClickListener {
            findNavController().navigate(R.id.action_recogerDato_to_mostrarDato, bundle)
        }
    }

}