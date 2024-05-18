package com.hamv15.musicplayerdiplo.ui

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.hamv15.musicplayerdiplo.R

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instanciamos el nav host (anfitrion)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)

        if (navHostFragment != null){
            navController = navHostFragment.findNavController()

            //Para que se genere la actionBar para la navegación
            NavigationUI.setupActionBarWithNavController(this, navController)
            //Para colocar un color personalizado.
            supportActionBar?.setBackgroundDrawable(ColorDrawable(getColor(R.color.actionBarColor)))
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }
}