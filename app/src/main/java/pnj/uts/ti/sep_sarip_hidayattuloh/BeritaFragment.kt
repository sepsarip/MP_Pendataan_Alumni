package pnj.uts.ti.sep_sarip_hidayattuloh

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ListView
import androidx.fragment.app.Fragment

class BeritaFragment : Fragment() {

    private val newsItems = listOf(
        NewsItem("Berita 1", "Detail berita satu...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 2", "Detail berita dua...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 3", "Detail berita tiga...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 4", "Detail berita empat...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 5", "Detail berita lima...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 6", "Detail berita enam...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 7", "Detail berita tujuh...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 8", "Detail berita delapan...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 9", "Detail berita sembilan...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain"),
        NewsItem("Berita 10", "Detail berita sepuluh...", "https://th.bing.com/th/id/OIP._2KcAjhfLzoZm34LMGXQdwHaHa?rs=1&pid=ImgDetMain")

        //masih butuh update library di gradle untuk load image from internet
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_berita, container, false)

        val listView = view.findViewById<ListView>(R.id.lv_berita)
        val adapter = NewsAdapter(requireContext(), newsItems)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val intent = Intent(requireContext(), DetailBeritaActivity::class.java)
            intent.putExtra("title", newsItems[position].title)
            intent.putExtra("detail", newsItems[position].description)
            intent.putExtra("imageUrl", newsItems[position].image)
            startActivity(intent)
        }

        return view
    }
}
