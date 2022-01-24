package com.example.finaluri.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.davaleba3_nika_svintradzejgufi12.fragments.FirstFragment
import com.example.davaleba3_nika_svintradzejgufi12.fragments.ThirdFragment
import com.example.finaluri.ShopActivity

class ViewPagerFragmentAdapter (acticity: AppCompatActivity) : FragmentStateAdapter(acticity) {
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
        if(position == 0){
            return FirstFragment()
        }
        return ThirdFragment()
    }
}