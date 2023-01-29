/*
package com.example.rickandmorty.di

import com.example.rickandmorty.data.server.RetrClient
import dagger.Component
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Component(modules = [RetrofitClientModule::class]) //граф зависимости
interface AppComponent{
    fun client(): RetrClient
}


@Module
object RetrofitClientModule{


    @Provides
    fun provideClient() =
        Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()


}*/
