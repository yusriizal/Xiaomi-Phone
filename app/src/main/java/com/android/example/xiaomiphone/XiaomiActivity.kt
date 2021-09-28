package com.android.example.xiaomiphone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.core.app.NavUtils

class XiaomiActivity : AppCompatActivity() {
    lateinit var XiaomiText: TextView
    lateinit var TitleXiaomi: TextView
    lateinit var imgXiaomi: ImageView
    private val titleAtBar = "Xiaomi & Poco"
    companion object {
        const val EXTRA_TITLE = "extra_title"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_xiaomi)

        setActionBar(titleAtBar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        XiaomiText = findViewById(R.id.xiaomi_text)
        imgXiaomi = findViewById(R.id.img_xiaomi)
        TitleXiaomi = findViewById(R.id.xiaomi_title)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val parser = XiaomiParser(this)

        parser.setXiaomiBasedTitle(XiaomiText, imgXiaomi, TitleXiaomi, title)

    }
    private fun setActionBar(title: String) {
        supportActionBar?.title = title
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            NavUtils.navigateUpFromSameTask(this);
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}