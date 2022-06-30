package com.otetcode.daggerproject.DaggerModule


import dagger.Module
import dagger.Provides

@Module
class BattleModule {

    @Provides
    fun setSenjata(): SenjataDaggerModule {
        return SenjataDaggerModule("Pedang Larva", "Tombak Halilintar")
    }

}