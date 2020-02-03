package com.gyasistory.myapplication.app

import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.gyasistory.myapplication.app.view.fragments.PostsFragment

class MainActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener, PostsFragment.OnFragmentInteractionListener {
    private var mNavController: NavController? = null
    var navigationView: NavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar =
            findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val fab = findViewById<FloatingActionButton>(R.id.fab)
        fab.setOnClickListener { view: View? ->
            Snackbar.make(view!!, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        val toggle =
            ActionBarDrawerToggle(
                this,
                drawer,
                toolbar,
                R.string.navigation_drawer_open,
                R.string.navigation_drawer_close
            )
        drawer.setDrawerListener(toggle)
        toggle.syncState()
        if (mNavController == null) {
            mNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        }
        navigationView = findViewById(R.id.nav_view)
        //        NavigationUI.setupWithNavController(navigationView, mNavController);
        navigationView?.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean { // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean { // Handle action bar item clicks here. The action bar will
// automatically handle clicks on the Home/Up button, so long
// as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        if (id == R.id.action_settings) {
            mNavController?.navigate(R.id.action_nav_welcome_to_settingsFragment)
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean { // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_post -> mNavController?.navigate(R.id.action_nav_welcome_to_postsFragment)
            R.id.nav_welcome -> mNavController?.navigate(R.id.action_nav_welcome_to_postsFragment)
            R.id.nav_settings_activity -> mNavController?.navigate(R.id.action_nav_welcome_to_settingsFragment)
        }
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onFragmentInteraction(uri: Uri?) {}

    override fun onSupportNavigateUp(): Boolean {
        if (mNavController == null) {
            mNavController = Navigation.findNavController(this, R.id.nav_host_fragment)
        }
        return mNavController!!.navigateUp()
    }
}

