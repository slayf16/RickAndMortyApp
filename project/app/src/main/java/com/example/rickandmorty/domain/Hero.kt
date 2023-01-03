package com.example.rickandmorty.domain

data class Hero (
    val id: Long,
    val name: String,
    val secondName: String,
    val location: String,
    val referenceImage: String
)