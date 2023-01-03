package com.example.rickandmorty.presentation.viewModel.listHeroes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmorty.R
import com.example.rickandmorty.domain.Hero
import com.google.android.material.card.MaterialCardView

class HeroesAdapter: RecyclerView.Adapter<HeroesAdapter.Holder>() {
    val heroes: List<Hero> = listOf(
        Hero(
            id = 1,
            name = "hbnjkm",
            secondName = "bhn",
            location = "ghbjnk",
            referenceImage = "hbnjkm"
        ) ,
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

    class Holder(
        private val view: View
    ) : RecyclerView.ViewHolder(view) {
        val nameHero by lazy { view.findViewById<TextView>(R.id.namePerson) }
        val secondNameHero by lazy { view.findViewById<TextView>(R.id.secondName) }
        val locationHero by lazy { view.findViewById<TextView>(R.id.location) }
        val pictureHero by lazy { view.findViewById<ImageView>(R.id.pictureHero) }
        val cardHero by lazy { view.findViewById<MaterialCardView>(R.id.card) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.content_list_item, parent,false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        heroes.getOrNull(position % heroes.size)?.let {
            holder.nameHero.text = it.name
            holder.secondNameHero.text = it.secondName
            holder.locationHero.text = it.location
        }
    }
    override fun getItemCount() =heroes.size
}