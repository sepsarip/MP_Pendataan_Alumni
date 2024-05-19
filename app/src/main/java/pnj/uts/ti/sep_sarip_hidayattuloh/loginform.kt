package pnj.uts.ti.sep_sarip_hidayattuloh

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class loginform : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginform)

        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editPassword = findViewById<EditText>(R.id.editPassword)
        val btnlogin = findViewById<AppCompatButton>(R.id.btnlogin)

        btnlogin.setOnClickListener {
            if(editEmail.text.toString().equals("sep@gmail.com") && editPassword.text.toString().equals("secret")){
                editEmail.text.toString()
                var data = getSharedPreferences("profile", Context.MODE_PRIVATE)
                var edit = data.edit()
                edit.putString("email", "sep@gmail.com")
                edit.putString("nama","sep sarip")
                edit.putString("nim", "2207411011")
                edit.putString("kelas", "TI 4A")
                edit.putBoolean("islogin", true)
                edit.apply()

                val email = data.getString("email", "N/A")
                val nim = data.getString("nim", "N/A")
                val nama = data.getString("nama", "N/A")
                val kelas = data.getString("kelas", "N/A")
                val islogin = data.getBoolean("islogin", false)




                Toast.makeText(this, "login sukses \n $islogin \n $email \n $nim \n $nama \n$kelas", Toast.LENGTH_SHORT).show()

                var pindah = Intent(this, MainActivity::class.java)
                startActivity(pindah)
                finish()

            }else{
                Toast.makeText(this, "login gagal coba lagi", Toast.LENGTH_SHORT).show()
            }

        }


    }
}
