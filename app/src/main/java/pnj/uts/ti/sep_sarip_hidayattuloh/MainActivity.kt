package pnj.uts.ti.sep_sarip_hidayattuloh

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.ContextMenu
import android.view.ContextMenu.ContextMenuInfo
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val save = getSharedPreferences("profile", Context.MODE_PRIVATE)
        val islogin = save.getBoolean("islogin", false)

        if (islogin) {
            startActivity(Intent(this, index::class.java))
            finish()
        }else{
            startActivity(Intent(this, loginform::class.java))
            finish()
        }

    }
}