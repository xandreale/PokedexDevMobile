package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokeMoves(
    @SerializedName("move")
    val move: PokeMoveName
)
