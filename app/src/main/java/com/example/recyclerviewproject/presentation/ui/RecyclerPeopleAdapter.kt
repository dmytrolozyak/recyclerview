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

//    private fun setDefault(holder: PeopleViewHolder){
//        Glide.with(holder.binding.root.context).clear(holder.binding.heroImageView)
//        holder.binding.heroName.text = ""
//        holder.binding.heroCountry.text = ""
//        holder.binding.heroPrice.text = ""
//    }

//    fun clearList() {
//        this.herolist.value?.clear()
//        Log.i("MYTAG" , "Adapter List:${this.herolist.value?..hashCode()}")
//        notifyDataSetChanged()
//    }

//
//    fun appendList(newList : List<GetTenantByIdResponse>) {
//
//        var rangeStart = this.herolist.value?..size+1
//        if (this.herolist.value?..isEmpty())
//            rangeStart = 0
//
//        val rangeEnd = rangeStart + newList.size
//        this.herolist.value?..addAll(newList)
//        notifyItemRangeInserted(rangeStart,rangeEnd)
//
//    }
}

class PeopleViewHolder(val binding: ConstraintItemBinding) : RecyclerView.ViewHolder (binding.root){


}
