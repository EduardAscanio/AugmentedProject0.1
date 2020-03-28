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

/*Clase Principal Main: Muestra la pantalla principal de la aplicacion,
                        en caso de que no haya objetos o Ambientes
                        almacenados mostrara un mensaje de bienvenida*/

class MenuActivity : AppCompatActivity() {

    /*Constructor Principal
    * R.Layout Viculo con XML
    * Soporte con Opciones del Menu*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.main_options))
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return if (item != null) {
            when (item.itemId) {
                R.id.search -> {
                    /*Search Options = Muestra una barra de Busqueda para los Objetos o Ambientes*/
                    val searchView = item.actionView as SearchView
//                    No Funciona porque tiene que ser V7 y no encuentra la carpeta
//                    val hint = searchView.findViewById<EditText>(android.support.v4.appcompat.R.id.search_src_text)
//                    hint.hint = "Search..."
                    searchView.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
                        override fun onQueryTextSubmit(query: String?): Boolean {
                            return true
                        }

                        override fun onQueryTextChange(newText: String?): Boolean {
                            return true
                        }

                    })
                    toast("Search_Expanded_5")
                    true
                }
                R.id.sort-> {
                    toast("Sort")
                    true
                }
                R.id.import_export-> {
                    toast("Import-export")
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
        } else false
    }
}
