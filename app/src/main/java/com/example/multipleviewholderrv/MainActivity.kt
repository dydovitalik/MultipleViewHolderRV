package com.example.multipleviewholderrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewholderrv.RecyclerViewHolder.ViewAdapter
import com.example.multipleviewholderrv.RecyclerViewHolder.ViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    private lateinit var Adapter: ViewAdapter

    private var arrList = ArrayList<ViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        arrList.add(ViewModel("JavaScript", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("JavaScript", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("JavaScript", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("JavaScript", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("JavaScript", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))
        arrList.add(ViewModel("Kotlin", "Awesome language"))

        Adapter = ViewAdapter(this, arrList)

        recyclerView.adapter = Adapter

        Adapter.notifyDataSetChanged()
    }
}