package com.example.allassignments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.allassignments.databinding.ActivityAndroidHistoryBinding.inflate
import com.example.allassignments.databinding.ActivityBdaygreetBinding.inflate
import com.example.allassignments.databinding.ActivityFragmentDemoBinding
import com.example.allassignments.databinding.ActivityFragmentDemoBinding.inflate
import com.example.allassignments.databinding.ActivityMainBinding

class fragment_demo : AppCompatActivity() {
    lateinit var binding: ActivityFragmentDemoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_demo)
        binding = ActivityFragmentDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.first.setOnClickListener(){
            replaceFragment(fragment1())
        }

        binding.second.setOnClickListener(){
            replaceFragment(fragment2())
        }
    }

    private fun replaceFragment(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.none,fragment)
        fragmentTransaction.commit()
    }
}