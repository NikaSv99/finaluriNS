package com.example.finaluri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.finaluri.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

private lateinit var tabLayout: TableLayout
private lateinit var viewPager2: ViewPager2

class ShopActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager)
        viewPager2.adapter = ViewPagerFragmentAdapter(this)
        TabLayoutMediator(tabLayout, viewPager2){tab, position ->
            tab.text = "Tab ${position + 1}"
        }.attach()

    }

    private fun TabLayoutMediator(tabLayout: TableLayout?, viewPager2: ViewPager2?, function: (tab: TabLayout.Tab, position: Int) -> Unit) {

    }

}

private fun Any.attach() {
    TODO("Not yet implemented")
}
