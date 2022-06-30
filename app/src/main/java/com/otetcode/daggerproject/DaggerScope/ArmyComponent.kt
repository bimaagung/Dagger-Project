package com.otetcode.daggerproject.DaggerScope

import dagger.Component

//class ini digunakan untuk menjembatani atau menghubungkan antara module dengan data yang akan di Inject.

@BattleScope
@Component(modules = [ArmyModule::class])
interface ArmyComponent {
    fun inject(house: House)
}