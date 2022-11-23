package com.example.recyclerviewproject.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.recyclerviewproject.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container, false)
        initListener()

        return binding.root
    }

    private fun initListener(){
        binding.recyclerViewButton.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToRecyclerViewFragment()
            findNavController().navigate(action)
        }
    }


}