package com.otetcode.daggerproject.DaggerQualifier

import dagger.Component


@Component (modules = [BattleQualifier::class])
interface BattleComponentQualifier {
    fun inject(context: MainActivityDaggerQualifier)
}