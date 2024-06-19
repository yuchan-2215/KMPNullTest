package com.example.nullpointertest

sealed class Games(val name: String) {
    data object Minecraft : Games(name = "minecraft")
    data object Mario : Games(name = "mario")

    companion object {
        val companionRoutes = listOf(Minecraft, Mario)
    }
}

val routes = listOf(Games.Minecraft, Games.Mario)
