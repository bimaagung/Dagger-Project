package com.otetcode.daggerproject.DI


class DarkKnightDI(val senjataDI: SenjataDI) {

    fun setEquip(): String {
        return "Kolempok DarkKnight Bertempur Menggunakan " + senjataDI.tombak()
    }
}