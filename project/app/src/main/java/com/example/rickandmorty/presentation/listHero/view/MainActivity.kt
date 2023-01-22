package com.example.rickandmorty.presentation.listHero.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.data.server.RetrClient
import com.example.rickandmorty.data.server.ServerResponce
import com.example.rickandmorty.domain.Hero
import com.example.rickandmorty.domain.helper.mapper.toHero
import com.example.rickandmorty.presentation.viewModel.listHeroes.HeroesController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler) }
    private val controller = HeroesController()

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager = LinearLayoutManager(baseContext)
        recycler.adapter = controller.adapter

        RetrClient.charactersService.getCharacters()
            .enqueue(object : Callback<ServerResponce> {
                override fun onResponse(
                    call: Call<ServerResponce>,
                    response: Response<ServerResponce>
                ) {
                    with(controller) {
                        heroes = response.body()?.results?.map { it.toHero() } ?: emptyList()
                        requestModelBuild()
                    }
                }

                override fun onFailure(call: Call<ServerResponce>, t: Throwable) {
                    TODO("Not yet implemented")
                }

            })
        controller.heroClickLiveData.observe(this) {
            Log.e("dsfsdf", "click on $it")
        }

    }
}