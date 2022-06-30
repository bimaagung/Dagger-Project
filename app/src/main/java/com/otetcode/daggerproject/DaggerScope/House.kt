package com.otetcode.daggerproject.DaggerScope

import javax.inject.Inject

//class ini digunakan untuk menyimpan kedua class tadi, yaitu UniqueArmy dan NormalArmy
// jangan lupa untuk menambahkan anotasi @Inject juga agar kedua class tersebut dapat di inject di kelas lainnya.

class House {

    @Inject
    lateinit var uniqueArmy: UniqueArmy
    @Inject
    lateinit var normalArmy: NormalArmy
}