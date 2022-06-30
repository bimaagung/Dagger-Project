package com.otetcode.daggerproject.DaggerQualifier


import com.otetcode.daggerproject.DaggerModule.SenjataDaggerModule
import dagger.Module
import dagger.Provides

@Module
class BattleQualifier {

    @Provides
    @Choose("SenjataUtama")
    fun setSenjata(): SenjataDaggerModule {
        return SenjataDaggerModule("Pedang Larva", "Tombak Halilintar")
    }

    @Provides
    @Choose("SenjataCadangan")
    fun setSenjataCadangan(): SenjataDaggerModule {
        return SenjataDaggerModule("Pedang Naga", "Tombak Golem")
    }

}