package com.blackberry.testappsecuresdk

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.athoc.mylibrary.TestLib
import com.blackberry.security.SecurityControl
import com.blackberry.testappsecuresdk.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_main)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

            TestLib.enableSecurity(applicationContext)

           /* val securityControl = SecurityControl(applicationContext)
            val isEnableSecurity = securityControl.enableSecurity()
            Log.d("TAG", "isEnableSecurity: $isEnableSecurity")

            val idToken = "eyJhbGciOiJSUzI1NiIsImtpZCI6IjRBNTZFREFFNjRGOEEzRDk2NEFBODUzMjgwQzAyMjQ5OEFCMTIwRjAiLCJ0eXAiOiJhdCtqd3QiLCJ4NXQiOiJTbGJ0cm1UNG85bGtxb1V5Z01BaVNZcXhJUEEifQ.eyJuYmYiOjE2ODI2OTk4MzYsImV4cCI6MTY4MjcwMzQzNiwiaXNzIjoiaHR0cHM6Ly9tb2JxYWl3czIwMTYuYXRob2NkZXZvLmNvbS9hdXRoc2VydmljZXMvYXV0aCIsImF1ZCI6ImF0aG9jLml3cy53ZWIuYXBpIiwiY2xpZW50X2lkIjoiQmxhY2tiZXJyeS5BdEhvYy5JV1MuUG9sbGluZy5BZ2VudCIsInN1YiI6Imh0dHBzOi8vbW9icWFpd3MyMDE2LmF0aG9jZGV2by5jb20vYXBpL3YyL3Fhb3JnLnRlc3QvdXNlcnMvcnVieV9xYW9yZyIsImF1dGhfdGltZSI6MTY4MjY5OTgzNiwiaWRwIjoibG9jYWwiLCJvcmdfY29kZSI6InFhb3JnLnRlc3QiLCJpd3NfaWQiOiJodHRwczovL21vYnFhaXdzMjAxNi5hdGhvY2Rldm8uY29tL2FwaS92Mi9xYW9yZy50ZXN0L3VzZXJzL3J1YnlfcWFvcmciLCJ1c2VyX2lkIjoiMjA1MTE3NyIsIkRJU1BMQVlOQU1FIjoicnVidmVybWFAYmxhY2tiZXJyeS5jb20iLCJGSVJTVE5BTUUiOiJydWJ2ZXJtYUBibGFja2JlcnJ5LmNvbSIsIkhBU19NVUxUSV9PUkdfQUNDRVNTIjoidHJ1ZSIsIkhPTUVfT1JHIjoicWFvcmcudGVzdCIsIkxBU1ROQU1FIjoiVmVybWEiLCJyb2xlIjpbIlJPUkdBRE0iLCJSU0RLIiwiUkFBUFVCIiwiUlNBQyIsIlJETE0iLCJSRVVNIiwiUkVOVEFETSIsIlJSTSIsIlJBTSIsIlJBQ1RNIiwiUkFDVE8iLCJSQ09MTEFCIiwiUExBTk0iLCJQTEFOSU5DTSIsIlJBUFVCIiwiUkFBTSJdLCJTQ1NfVVNFUl9JRCI6IjdhOGE4MTEzLTAxMDctNDFlMy05ZmE4LTQwYTVjZDk2OTkzMyIsIlNUQVRVUyI6IlZMRCIsIlVTRVJOQU1FIjoicnVieV9xYW9yZyIsInNjb3BlIjpbIm9wZW5pZCIsInByb2ZpbGUiLCJhdGhvYy5pd3Mud2ViLmFwaSIsIm9mZmxpbmVfYWNjZXNzIl0sImFtciI6WyJ1c2VyX2lkX29yZ19pZCJdfQ.U1vXUdkYl2E-Ma-WJ2XdnHefv_WCouZMxan3Q4h6Q7QPNfaiyIOYyoQMXY87I-Zvy1jaAAAlLDmmnzeL1OrPuRJB6SddlT-g3F3moeccJKlGRM5PAZiVMVgRXVoPNpKak1cWXYwC7QIYUTo48MyAk9exuudvSeVWhEYdHPTQxUJfUyK0o-iktXkLhRvYWWVu9DsNPYsuyW25dzAZFurXTdv2ui-8K4HEKJTxvVy_cYZeuUVLaTu4s4Gdz6AWdDN17GnWaC_bF_oJHLIXNmW1HxZEfOelfell--MGrUwRMnOk_xaXYfw19LvBunZmpagu2gBuEFVmmUEUb1W9ydgf_Q"
            securityControl.provideToken(idToken)*/
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}