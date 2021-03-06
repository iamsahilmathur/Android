package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var productAdapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.productRv.apply {
            hasFixedSize()
            productAdapter= ProductAdapter()
            adapter= productAdapter
            productAdapter.addAll(listGenerator())
        }

    }

    fun listGenerator() : ArrayList<String>{
      val itemList : ArrayList<String> = ArrayList()

       for(i  in 0..10){
           itemList.add("Grape $i")
       }
        return itemList
    }
}