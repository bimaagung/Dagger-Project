package com.otetcode.daggerproject.DaggerModule

import dagger.Component


@Component (modules = [BattleModule::class])
interface BattleComponentModule {
    fun inject(context: MainActivityDaggerModule)
}