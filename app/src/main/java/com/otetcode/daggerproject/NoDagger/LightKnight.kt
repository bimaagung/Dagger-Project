package com.otetcode.daggerproject.NoDagger

class LightKnight {

    private val senjata = Senjata()

    fun setEquip(): String{
        return "Kolempok LightKnight Bertempur Menggunakan " + senjata.pedang()
    }
}