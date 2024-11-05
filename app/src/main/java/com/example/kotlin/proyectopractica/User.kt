package com.example.kotlin.proyectopractica

data class User(var name: String, var age: Int){

    fun isAdult(): Boolean {
        return age>= 18
    }

    fun isTeenager(): Boolean {
        return age in 13..17
    }

    fun isChild(): Boolean{
        return age<13
    }
}