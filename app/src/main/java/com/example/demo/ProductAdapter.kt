package com.example.demo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.demo.databinding.ItemRowBinding

class ProductAdapter : RecyclerView.Adapter<ProductAdapter.MyViewHolder>() {

    lateinit var itemList : ArrayList<String>;


    fun addAll(itemList : ArrayList<String>){
        this.itemList= itemList
        notifyDataSetChanged()
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val layoutInflater : LayoutInflater = LayoutInflater.from(parent.context)
       val itemBinding : ItemRowBinding = DataBindingUtil.inflate(layoutInflater,R.layout.item_row,parent,false)
        return MyViewHolder(itemBinding)
    }

    override fun getItemCount(): Int {
       return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         val item : String = itemList.get(position)

        holder.mViewBinding.fruitName.text = item

    }

    class MyViewHolder(viewBinding : ItemRowBinding) : RecyclerView.ViewHolder(viewBinding.root){
        val mViewBinding : ItemRowBinding= viewBinding

    }


}