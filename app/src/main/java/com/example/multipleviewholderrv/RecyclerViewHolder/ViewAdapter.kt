package com.example.multipleviewholderrv.RecyclerViewHolder

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewholderrv.R

class ViewAdapter(var ctx: Context, var arrList: ArrayList<ViewModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       var layoutInflater = LayoutInflater.from(parent.context)
       var view: View

       if (viewType == 0){
           view = layoutInflater.inflate(R.layout.custom_model, parent, false)
           return viewHolderOne(view)
       }else{
           view = layoutInflater.inflate(R.layout.custom_model_second, parent, false)
           return viewHolderTwo(view)
       }
    }

    override fun getItemViewType(position: Int): Int {
        if (!arrList[position].title.contains("JavaScript")) {
            return 0
        }else{
            return 1
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
      if (!arrList[position].title.contains("JavaScript")){
           var holder = holder as viewHolderOne
           return holder.bindItemOne(arrList[position])
      }else{
           var holder = holder as viewHolderTwo
           return holder.bindItemTwo(arrList[position])
      }
    }

    override fun getItemCount(): Int {
        return arrList.size
    }

    inner class viewHolderOne(itemView : View): RecyclerView.ViewHolder(itemView){

        fun bindItemOne(item: ViewModel) {
            var title = itemView.findViewById<TextView>(R.id.viewTitle)
            var subTitle = itemView.findViewById<TextView>(R.id.viewSubtitle)

            title.text = item.title
            subTitle.text = item.subtitle
        }

    }

    inner class viewHolderTwo(itemView : View): RecyclerView.ViewHolder(itemView){

        fun bindItemTwo(item: ViewModel) {
            var image = itemView.findViewById<ImageView>(R.id.imageFirst)
            var title = itemView.findViewById<TextView>(R.id.titleSecond)

            title.text = item.title
        }

    }
}