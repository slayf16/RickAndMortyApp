package com.example.rickandmorty.presentation.view.listHeroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.presentation.viewModel.listHeroes.HeroesAdapter

class MainActivity : AppCompatActivity() {
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler) }
    private val adapter = HeroesAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager = LinearLayoutManager(baseContext)
        recycler.adapter = adapter
    }
}