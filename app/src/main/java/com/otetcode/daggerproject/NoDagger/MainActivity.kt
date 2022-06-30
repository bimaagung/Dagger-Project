package com.otetcode.daggerproject.NoDagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otetcode.daggerproject.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lightKnight = LightKnight()
        val darkKnight = DarkKnight()

        click_me.setOnClickListener {
            val getReport = lightKnight.setEquip() + " dan " + darkKnight.setEquip()
            report.text = getReport
        }
    }
}
