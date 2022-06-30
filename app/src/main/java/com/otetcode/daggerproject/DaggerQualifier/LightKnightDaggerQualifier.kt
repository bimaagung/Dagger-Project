package com.otetcode.daggerproject.DaggerQualifier

import com.otetcode.daggerproject.DaggerModule.SenjataDaggerModule
import javax.inject.Inject


class LightKnightDaggerQualifier @Inject constructor() {

    @Inject
    @field:Choose("SenjataUtama")
    lateinit var senjataUtama: SenjataDaggerModule

    @Inject
    @field:Choose("SenjataCadangan")
    lateinit var senjataCadangan: SenjataDaggerModule

    fun setEquip(): String{
        return ("Kelompok LightKnight Bertempur Menggunakan " + senjataUtama.pedang() + " dan " + senjataCadangan.pedang())
    }
}