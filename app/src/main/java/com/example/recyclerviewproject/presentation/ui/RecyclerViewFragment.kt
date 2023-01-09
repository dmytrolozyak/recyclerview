package com.example.recyclerviewproject.presentation.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recyclerviewproject.R
import com.example.recyclerviewproject.databinding.FragmentRecyclerViewBinding


class RecyclerViewFragment : Fragment() {
    private var _binding : FragmentRecyclerViewBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentRecyclerViewBinding.inflate(inflater,container, false)
        initView()
        return binding.root
    }

    private fun initView(){
        binding.rvPeople.layoutManager = LinearLayoutManager(activity)
        binding.rvPeople.adapter = RecyclerPeopleAdapter()
    }


}