package com.otetcode.daggerproject.NoDagger

class DarkKnight {

    private val senjata = Senjata()

    fun setEquip(): String {
        return "Kolempok DarkKnight Bertempur Menggunakan " + senjata.tombak()
    }
}