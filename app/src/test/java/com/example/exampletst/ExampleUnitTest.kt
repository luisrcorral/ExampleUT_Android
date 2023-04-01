package com.example.exampletst

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun tst_case_01_addition_isCorrect() {
        var a : Int
        var b : Int
        var c : Int

        a = 3
        b = 8
        c = 12345
        c = a + b
        assertEquals(11, c)
    }

    @Test
    fun tst_case_02_addition_isCorrect() {
        var a : Int
        var b : Int
        var c : Int

        a = 10
        b = 8
        c = 12345
        c = a - b
        assertEquals(2, c)
    }
}