package com.example.affirmationsv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.affirmationsv2.adapter.ItemAdapter
import com.example.affirmationsv2.data.Datasource
import com.example.affirmationsv2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
    }

    private fun initUi(){
        val myDateSet = Datasource().loadAffirmations()
        binding.affirmationsRv.adapter = ItemAdapter(this, myDateSet)
        binding.affirmationsRv.setHasFixedSize(true)
        //binding.affirmationsRv.layoutManager = GridLayoutManager(this, 3)
       // binding.sizeAffirmationList.text = Datasource().loadAffirmations().size.toString()
    }

}