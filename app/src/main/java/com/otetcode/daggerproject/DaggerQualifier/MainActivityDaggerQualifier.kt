package com.otetcode.daggerproject.DaggerQualifier

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otetcode.daggerproject.Dagger.DaggerBattleComponent
import com.otetcode.daggerproject.R
import kotlinx.android.synthetic.main.activity_main_di.*
import javax.inject.Inject

//Menggunakan Depencdency Injection

//Qualifier digunakan untuk membuat fungsi di class Qualifier lebih dari 1

class MainActivityDaggerQualifier : AppCompatActivity() {

    @Inject lateinit var darkKnightDagger: DarkKnightDaggerQualifier
    @Inject lateinit var lightKnightDagger: LightKnightDaggerQualifier

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dagger)

        DaggerBattleComponentQualifier.create().inject(this)

        click_me.setOnClickListener {
            val getReport = lightKnightDagger.setEquip() + " dan " + darkKnightDagger.setEquip()
            report.text = getReport
        }
    }
}
