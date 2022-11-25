package br.com.up.pokedex.model

import com.google.gson.annotations.SerializedName

data class PokeAbilities(
    @SerializedName("ability")
    val ability: PokeAbName
)
