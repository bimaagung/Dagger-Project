package com.otetcode.daggerproject.DaggerModule

import javax.inject.Inject


class LightKnightDaggerModule @Inject constructor(val senjataDaggerModule: SenjataDaggerModule) {

    fun setEquip(): String{
        return "Kolempok LightKnight Bertempur Menggunakan Pedang" + senjataDaggerModule.pedang()
    }
}