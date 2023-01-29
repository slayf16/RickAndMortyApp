package com.example.rickandmorty.domain

import com.example.rickandmorty.data.server.location

data class Hero (
    val id: Long = 0,
    val name: String = "",
    val species: String,
    val location: location,
    //val referenceImage: String
)