package com.android.example.xiaomiphone

import android.icu.text.CaseMap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.core.app.NavUtils

class AboutActivity : AppCompatActivity() {
    private val title: String ="Tentang Saya"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionBarTitle(title)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    private fun setActionBarTitle(title: String){
        supportActionBar?.title=title
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this)
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}