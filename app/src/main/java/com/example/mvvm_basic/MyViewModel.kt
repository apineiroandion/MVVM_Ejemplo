package com.example.mvvm_basic


import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    /**
     * Variable que almacena el número
     */
    var _numbers = mutableStateOf(0)

    /**
     * Etiqueta para los logs
     */
    private val TAG_LOG = "miDebug"

    /**
     * Inicializamos el ViewModel
     */
    init {
        Log.d(TAG_LOG, "Inicializamos ViewModel")
    }
    /**
     * Crear entro random
     */
    fun crearRandom() {
        _numbers.value = (0..10).random()
        Log.d(TAG_LOG, "creamos random ${_numbers.value}")
        actualizarNumero(_numbers.value)
    }

    /**
     * Actualizar el número
     */
    fun actualizarNumero(numero: Int) {
        Log.d(TAG_LOG, "actualizamos numero en Datos")
        Datos.numero = numero
    }

    /**
     * Obtener el número
     */
    fun obtenerNumero(): Int {
        Log.d(TAG_LOG, "obtenemos numero en Datos" + Datos.numero)
        return Datos.numero
    }

}