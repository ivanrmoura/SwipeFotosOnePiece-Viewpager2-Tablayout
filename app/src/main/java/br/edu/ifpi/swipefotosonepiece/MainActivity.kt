package br.edu.ifpi.swipefotosonepiece

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import br.edu.ifpi.swipefotosonepiece.adapter.ViewPagerAdapter
import br.edu.ifpi.swipefotosonepiece.fragment.LuffyFragment
import br.edu.ifpi.swipefotosonepiece.fragment.NamiFragment
import br.edu.ifpi.swipefotosonepiece.fragment.ZoroFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewpager)

        val fragments = listOf(LuffyFragment(), NamiFragment(), ZoroFragment())

        viewPager.adapter = ViewPagerAdapter(fragments, supportFragmentManager, lifecycle)

        val tab = findViewById<TabLayout>(R.id.tablayout)

        val titulos = listOf("LUFFY", "NAMI", "ZORO")

        TabLayoutMediator(tab, viewPager){
            tab, position ->
            apply {
                tab.text = titulos[position]
            }
        }.attach()


    }
}