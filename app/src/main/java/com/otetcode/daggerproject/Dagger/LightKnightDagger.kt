package com.otetcode.daggerproject.Dagger

import javax.inject.Inject


class LightKnightDagger @Inject constructor() {

    fun setEquip(): String{
        return "Kolempok LightKnight Bertempur Menggunakan Pedang"
    }
}