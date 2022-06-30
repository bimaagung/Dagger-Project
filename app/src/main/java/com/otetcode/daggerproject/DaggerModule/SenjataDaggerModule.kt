package com.otetcode.daggerproject.DaggerModule

class SenjataDaggerModule(val namaPedang:String, val namaTombak:String) {

    fun tombak(): String{
        return namaTombak
    }

    fun pedang(): String{
        return namaPedang
    }


}