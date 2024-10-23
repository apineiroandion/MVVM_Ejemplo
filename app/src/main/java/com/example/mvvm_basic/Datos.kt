package com.example.mvvm_basic

import androidx.compose.ui.graphics.Color


object Datos {
    var numero = 0
}

enum class Colores(val color: Color, val txt: String) {
    CLASE_ROJO(color = Color.Red, "roxo"),
    CLASE_AMARELO(color = Color.Yellow, "amarelo"),
    CLASE_VERDE(color = Color.Green, "verde"),
    CLASE_AZUL(color = Color.Blue, "azul"),
}