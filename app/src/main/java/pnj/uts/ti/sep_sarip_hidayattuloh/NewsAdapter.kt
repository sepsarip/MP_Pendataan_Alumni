package pnj.uts.ti.sep_sarip_hidayattuloh

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class NewsAdapter(context: Context, private val newsList: List<NewsItem>) :
    ArrayAdapter<NewsItem>(context, 0, newsList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.list_item_news, parent, false)
        }

        val currentItem = newsList[position]

        val imageNews = itemView?.findViewById<ImageView>(R.id.newsImage)
        val textTitle = itemView?.findViewById<TextView>(R.id.newsTitle)
        val textDescription = itemView?.findViewById<TextView>(R.id.newsDescription)

//        imageNews?.setImageResource(currentItem.image)
        textTitle?.text = currentItem.title
        textDescription?.text = currentItem.description

        return itemView!!
    }
}