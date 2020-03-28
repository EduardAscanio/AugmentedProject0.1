package com.example.tesisprop2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.EditText
import android.widget.SearchView
import org.jetbrains.anko.toast
import java.util.ArrayList

class ListActivity : AppCompatActivity(){

    var objects:MutableList<Any> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.objets_list)
        setSupportActionBar(findViewById(R.id.main_options))
    }
}