package com.example.nullpointertest

class GameLib {
    fun companionTest(): String {
        return Games.companionRoutes.first().name
    }

    fun outTest(): String {
        return routes.first().name
    }
}

sealed class Games(val name: String) {
    data object Minecraft : Games(name = "minecraft")
    data object Mario : Games(name = "mario")

    companion object {
        val companionRoutes = listOf(Minecraft, Mario)
    }
}
val routes = listOf(Games.Minecraft, Games.Mario)
