package com.zulham.filmntv.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zulham.filmntv.adapter.PagerAdapter
import com.zulham.filmntv.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = PagerAdapter(supportFragmentManager)
        adapter.addFragment(FilmFragment(), getString(R.string.TabFilm))
        adapter.addFragment(TVFragment(), getString(R.string.TabTV))

        view_pager_main.adapter = adapter
        tab_layout_main.setupWithViewPager(view_pager_main)
    }
}