package com.otetcode.daggerproject.DaggerScope

import dagger.Module
import dagger.Provides

// class ini digunakan sebagai class module kita yang menyimpan dependency yang akan digunakan.

@Module
class ArmyModule {

    private var pasukan = 5

    @BattleScope
    @Provides
    fun uniqueArmy(): UniqueArmy {
        return UniqueArmy(pasukan++)
    }

    @Provides
    fun normalArmy(): NormalArmy{
        return NormalArmy(pasukan++)
    }


}