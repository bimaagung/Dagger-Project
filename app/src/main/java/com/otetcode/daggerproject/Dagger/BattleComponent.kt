package com.otetcode.daggerproject.Dagger

import dagger.Component

@Component
interface BattleComponent {
    fun inject(context: MainActivityDagger)
}