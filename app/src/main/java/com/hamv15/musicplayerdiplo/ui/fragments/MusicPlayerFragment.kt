package com.hamv15.musicplayerdiplo.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hamv15.musicplayerdiplo.R
import com.hamv15.musicplayerdiplo.databinding.FragmentMusicListBinding
import com.hamv15.musicplayerdiplo.databinding.FragmentMusicPlayerBinding

class MusicPlayerFragment : Fragment() {

    private var  _binding: FragmentMusicPlayerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMusicPlayerBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}