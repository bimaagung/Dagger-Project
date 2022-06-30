package com.otetcode.daggerproject.DI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otetcode.daggerproject.R
import kotlinx.android.synthetic.main.activity_main_di.*

//Menggunakan Depencdency Injection

class MainActivityDI : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_di)

        val senjataDI = SenjataDI("Pedang", "Tombak")

        val lightKnightDI = LightKnightDI(senjataDI)
        val darkKnightDI = DarkKnightDI(senjataDI)

        click_me.setOnClickListener {
            val getReport = lightKnightDI.setEquip() + " dan " + darkKnightDI.setEquip()
            report.text = getReport
        }
    }
}
