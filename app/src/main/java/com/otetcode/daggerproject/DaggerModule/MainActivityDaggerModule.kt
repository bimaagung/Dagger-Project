package com.otetcode.daggerproject.DaggerModule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otetcode.daggerproject.R
import kotlinx.android.synthetic.main.activity_main_di.*
import javax.inject.Inject

//Menggunakan Depencdency Injection

//Dengan menggunakan Dagger 2, kita tidak perlu meng-inisialisasikan parameter tersebut saat membuat instance didalam MainActivity. contohnya seperti ini.
//val senjata = Senjata("Pedang Larva", "Pedang Halilintar")
//Kalo cuma di MainActivity saja tidak jadi masalah, iya kan?, tapi bagaimana jika ada class lain juga yang ingin mengakses class Senjata,
// pastinya kita juga perlu membuat instance dari class tersebut satu-per-satu kan, kalo gitu bakalan ribet nantinya.

class MainActivityDaggerModule : AppCompatActivity() {

    @Inject lateinit var darkKnightDagger: DarkKnightDaggerModule
    @Inject lateinit var lightKnightDagger: LightKnightDaggerModule

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dagger)

//        DaggerBattleComponentModule.create().inject(this)

        click_me.setOnClickListener {
            val getReport = lightKnightDagger.setEquip() + " dan " + darkKnightDagger.setEquip()
            report.text = getReport
        }
    }
}
