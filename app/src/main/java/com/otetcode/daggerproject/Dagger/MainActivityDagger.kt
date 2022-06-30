package com.otetcode.daggerproject.Dagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.otetcode.daggerproject.R
import kotlinx.android.synthetic.main.activity_main_di.*
import javax.inject.Inject

//Menggunakan Depencdency Injection

//Untuk setiap Instance atau Objek, kita cukup membuatnya didalam MainActivity saja,
// karena objek tersebut hanya akan di eksekusi pada MainActivity pada saat button di klik.
// Tapi jika se waktu-waktu objek tersebut di akses oleh class lain (selain MainActivity) pastinya kita harus membuat Objeknya lagi.
// Misalnya ada 5 Activity yang ingin mengakses class LightKnight dan DarkKnight pastinya repot, harus membuatnya satu per satu.
//
//Salah satu solusi untuk mengatasi permasalahan tersebut yaitu dengan menggunakan Dagger 2,
// sebuah library yang dapat mengubah kode DI menjadi lebih praktis dan efsien.

class MainActivityDagger : AppCompatActivity() {

    @Inject lateinit var darkKnightDagger: DarkKnightDagger
    @Inject lateinit var lightKnightDagger: LightKnightDagger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dagger)

        DaggerBattleComponent.create().inject(this)

        click_me.setOnClickListener {
            val getReport = lightKnightDagger!!.setEquip() + " dan " + darkKnightDagger!!.setEquip()
            report.text = getReport
        }
    }
}
