package com.example.exampletst

import android.util.Log
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test

class HelperDBTest {

    //Annotation @Test is mandatory to bound a test case
    @Test
    fun testMyFun() {
        // Instantiate the class under test
        val helperClassInstance = HelperDB()

        // Establish Input Values
        val expectedString: String = "Hello" // I'm setting a different value on purpose
        var actualString : String = "aaaaa"

        // Execute the method under test

        actualString = helperClassInstance.myFun("Hello World")

        // Evaluate your assertion
        assertEquals(actualString, expectedString)

        // To run the test, right-click on the exampletst folder and go to run test
    }
}