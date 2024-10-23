package com.example.mvvm_basic

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button

import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.unit.dp

@Composable
fun IU(model: MyViewModel) {
    boton(enum_color = Colores.CLASE_AZUL, model = model)
}

@Composable
fun boton (enum_color: Colores, model: MyViewModel) {
    val TAG_LOG: String = "miDebug"
    var texto by remember { mutableStateOf("Boton") }
    Column(
        modifier = androidx.compose.ui.Modifier.padding(20.dp)
    ) {
        Button(
            colors = ButtonDefaults.buttonColors(enum_color.color),
            onClick = {
                model.crearRandom()
                Log.d(TAG_LOG, "Dentro del boton" + model.obtenerNumero())
                texto = model.obtenerNumero().toString()
                },
        ) {
            Text(text = texto)
        }
    }
}

