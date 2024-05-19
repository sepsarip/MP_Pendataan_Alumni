package pnj.uts.ti.sep_sarip_hidayattuloh

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailBeritaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_berita)

        val title = intent.getStringExtra("title")
        val detail = intent.getStringExtra("detail")
        val image = intent.getStringExtra("image")

        val newsTitleTextView = findViewById<TextView>(R.id.newsTitle)
        val newsDetailTextView = findViewById<TextView>(R.id.newsDetail)
        val newsImageView = findViewById<ImageView>(R.id.newsImage)

        newsTitleTextView.text = title
        newsDetailTextView.text = detail
    }
}
