package com.android.example.xiaomiphone

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ShareCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.example.xiaomiphone.XiaomiData.listData
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private var title: String = "Xiaomi Info"
    private lateinit var Xiaomi : RecyclerView
    private var list: ArrayList<Xiaomi> = arrayListOf()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setActionBarTitle(title)

        Xiaomi = findViewById(R.id.xiaomi)
        Xiaomi.setHasFixedSize(true)
        list.addAll(XiaomiData.listData)
        showRecycleList()

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.corner_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.menu.corner_menu ->{
                val detailsActivity = Intent(this, XiaomiActivity::class.java)
                startActivity(detailsActivity)
            }
            else -> {
                val aboutActivity = Intent(this, AboutActivity::class.java)
                startActivity(aboutActivity)
            }
        }
        return super.onOptionsItemSelected(item)
    }
    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
    private fun showRecycleList(){
        Xiaomi.layoutManager = LinearLayoutManager(this)
        var listXiaomi = ListXiaomi(list)
        Xiaomi.adapter = listXiaomi

        listXiaomi.setOnItemClickCallback(object : ListXiaomi.OnItemClickCallback{
            override fun onItemClicked(data: Xiaomi){
                val intent = Intent(this@MainActivity, XiaomiActivity::class.java)
                intent.putExtra(XiaomiActivity.EXTRA_TITLE, data.name)
                startActivity(intent)
            }
        })
    }

}