package com.example.rickandmorty.data.server

data class ServerCharacter(
    val id: Long,
    val name: String,
    //val species: String = "неизвестно",//разновидность
    //val location: String, //последняя известная локация (имя и ссылка) todo: требуется распарс
   // val image: String // ссылка на картинку
)
