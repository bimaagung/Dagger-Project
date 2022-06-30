package com.otetcode.daggerproject.DaggerScope

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otetcode.daggerproject.R
import kotlinx.android.synthetic.main.activity_main_scope.*


//Scoper digunakan untuk membuat class unique atau kelas unik yang hanya dapat di panggil 1 kali saja.
//Disinilah peranan dari @Scope, antasi tersebut dapat digunakan untuk menendai class mana yang akan dibuat unik.

class MainActivityScope : AppCompatActivity() {

    private var armyComponent: ArmyComponent? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_scope)

        armyComponent = DaggerArmyComponent.create()

        click_me.setOnClickListener {
            val house = House()
            armyComponent!!.inject(house)
            val reportBattleScope = ("Pasukan DarkKnight " + house.uniqueArmy.jumlahPasukan + " Orang\n" + "Pasukan LightKnight " + house.normalArmy.jumlahPasukan + " Orang")

            report.text = reportBattleScope
        }

    }
}
