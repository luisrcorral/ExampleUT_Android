package com.example.exampletst


import org.junit.Assert.assertEquals
import org.junit.Test

class HelperDBTest {

    //Annotation @Test is mandatory to bound a test case
    @Test
    fun testMyFun_TV1() {
        // Instantiate the class under test
        val helperClassInstance = HelperDB()

        // Establish Input Values
        val expectedString: String = "Hello" // I'm setting a different value on purpose
        var actualString : String = "xxxxxx"

        // Execute the method under test

        actualString = helperClassInstance.myFun("Hello")

        // Evaluate your assertion
        assertEquals(actualString, expectedString)

        // To run the test, right-click on the exampletst folder and go to run test
    }
}