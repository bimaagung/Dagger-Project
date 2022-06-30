package com.otetcode.daggerproject.DaggerQualifier


import com.otetcode.daggerproject.DaggerModule.SenjataDaggerModule
import javax.inject.Inject


class DarkKnightDaggerQualifier @Inject constructor() {

    @Inject
    @field:Choose("SenjataUtama")
    lateinit var senjataUtama: SenjataDaggerModule

    @Inject
    @field:Choose("SenjataCadangan")
    lateinit var senjataCadangan: SenjataDaggerModule

    fun setEquip(): String {
        return ("Kelompok DarkKnight Bertempur Menggunakan " + senjataUtama.tombak() + " dan " + senjataCadangan.tombak())
    }
}