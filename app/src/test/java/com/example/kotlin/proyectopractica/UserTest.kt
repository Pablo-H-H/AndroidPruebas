package com.example.kotlin.proyectopractica

import org.junit.Test

import org.junit.Assert.*

class UserTest {

    @Test
    fun user_IsAdult() {
        val use = User("John", 20)
        assertTrue(use.isAdult())
    }

    @Test
    fun user_isTeenager() {
        val use = User("John", 17)
        assertTrue(use.isTeenager())
    }

    @Test
    fun user_isChild() {
        val use = User("John", 12)
        assertTrue(use.isChild())
    }

}