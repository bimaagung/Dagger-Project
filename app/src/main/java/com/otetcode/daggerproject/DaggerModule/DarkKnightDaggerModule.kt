package com.otetcode.daggerproject.DaggerModule

import javax.inject.Inject


class DarkKnightDaggerModule @Inject constructor(val senjataDaggerModule: SenjataDaggerModule) {

    fun setEquip(): String {
        return "Kelompok DarkKnight Bertempur Menggunakan Tombak " + senjataDaggerModule.tombak()
    }
}