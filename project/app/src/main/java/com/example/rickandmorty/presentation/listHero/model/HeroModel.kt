package com.example.rickandmorty.presentation.listHero.model

import android.view.View
import android.view.ViewParent
import android.widget.TextView
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.example.rickandmorty.R
import com.example.rickandmorty.domain.Hero

data class HeroModel(
    private val hero: Hero,
    private val clickAction: (Long) -> Unit
) : EpoxyModelWithHolder<HeroModel.Holder>() {
    init {
        id(hero.id)
    }

    override fun bind(holder: Holder) = with(holder) {
        root?.setOnClickListener {
            clickAction.invoke(hero.id)
        }
        nameHero?.text = hero.name
    }

    override fun getDefaultLayout() = R.layout.content_list_item
    override fun createNewHolder(parent: ViewParent) = Holder()
    class Holder : EpoxyHolder() {
        var root: View? = null
        var nameHero: TextView? = null

        /*val secondNameHero by lazy { view.findViewById<TextView>(R.id.secondName) }
        val locationHero by lazy { view.findViewById<TextView>(R.id.location) }
        val pictureHero by lazy { view.findViewById<ImageView>(R.id.pictureHero) }
        val cardHero by lazy { view.findViewById<MaterialCardView>(R.id.card) }*/
        override fun bindView(itemView: View) {
            root = itemView
            nameHero = itemView.findViewById(R.id.namePerson)
        }
    }
}
