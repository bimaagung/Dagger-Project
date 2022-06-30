package com.otetcode.daggerproject.DI

class SenjataDI(private val namaPedang:String, private val namaTombak:String) {

    fun tombak(): String{
        return namaTombak
    }

    fun pedang(): String{
        return namaPedang
    }


}