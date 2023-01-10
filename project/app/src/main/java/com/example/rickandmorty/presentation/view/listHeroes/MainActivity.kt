package com.example.rickandmorty.presentation.view.listHeroes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.domain.Hero
import com.example.rickandmorty.presentation.viewModel.listHeroes.HeroesAdapter
import com.example.rickandmorty.presentation.viewModel.listHeroes.HeroesController
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    private val recycler by lazy { findViewById<RecyclerView>(R.id.recycler) }
    private val adapter = HeroesAdapter()
    private val controller = HeroesController()

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycler.layoutManager = LinearLayoutManager(baseContext)
        recycler.adapter = controller.adapter

        findViewById<FloatingActionButton>(R.id.floating)?.setOnClickListener {
            val heroes = when(counter++) {
                0 -> listOf(
                    Hero(
                        id = 1,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 2,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    )
                )
                1 -> listOf(
                    Hero(
                        id = 1,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 2,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 3,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    )
                )
                2 -> listOf(
                    Hero(
                        id = 1,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 2,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 3,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 4,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 5,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    )
                )
                3 -> listOf(
                    Hero(
                        id = 2,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 4,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    ),
                    Hero(
                        id = 5,
                        name = "hbnjkm",
                        secondName = "bhn",
                        location = "ghbjnk",
                        referenceImage = "hbnjkm"
                    )
                )
                else -> emptyList()
            }
            controller.apply {
                this.heroes = heroes
                requestModelBuild()
            }
        }

        controller.heroClickLiveData.observe(this) {
            Log.e("dsfsdf", "click on $it")
        }

    }
}