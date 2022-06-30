package com.otetcode.daggerproject.DI



class LightKnightDI(private val senjataDI: SenjataDI) {

    fun setEquip(): String{
        return "Kolempok LightKnight Bertempur Menggunakan " + senjataDI.pedang()
    }
}