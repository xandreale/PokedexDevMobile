package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokemonStats(
    @SerializedName("base_stat")
    val baseStat: Int,
    @SerializedName("stat")
    val stat: PokeStatName
)
