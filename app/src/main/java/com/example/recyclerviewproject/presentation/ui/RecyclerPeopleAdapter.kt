package com.example.recyclerviewproject.presentation.ui

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewproject.R
import com.example.recyclerviewproject.databinding.ConstraintItemBinding

class RecyclerPeopleAdapter()
    : RecyclerView.Adapter<PeopleViewHolder> () {

    private var _binding: ConstraintItemBinding? = null
    private val binding get() = _binding!!

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeopleViewHolder {
        _binding = ConstraintItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PeopleViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PeopleViewHolder, position: Int) {
        holder.binding.name.text = "Caden Lin ${position+1}"
        holder.binding.time.text = "06:43"
        holder.binding.description.text = "Description is essential part of this layout"
        holder.binding.profileImage.setImageResource(R.drawable.face)


    }

    override fun getItemCount(): Int {
        return 100
    }

}

class PeopleViewHolder(val binding: ConstraintItemBinding) : RecyclerView.ViewHolder (binding.root){


}
