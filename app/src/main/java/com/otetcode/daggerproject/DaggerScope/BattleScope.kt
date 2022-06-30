package com.otetcode.daggerproject.DaggerScope

import javax.inject.Scope

//class ini digunakan untuk membuat anotasi baru turunan dari Scope, kalian juga dapat memberikan nama class tersebut bebas.
@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
annotation class BattleScope