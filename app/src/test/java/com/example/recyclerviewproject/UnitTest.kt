package com.example.recyclerviewproject

import android.content.Context
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

private const val FAKE_STRING = "HELLO WORLD"
@RunWith(
    MockitoJUnitRunner::class)
class UnitTest {

    @Mock
    private lateinit var mockContext: Context

    @Test
    fun readStringFromContext_LocalizedString(){
        val mockContext = mock<Context>{
            on { getString(R.string.lorem) } doReturn FAKE_STRING
        }
        val myObjectUnderTest = ClassUnderTest(mockContext)

        val result = myObjectUnderTest.getName()

        assertEquals(result, FAKE_STRING)
    }
    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue(){
        assertTrue(EmailValidator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CheckEmpty_ReturnsFalse(){
        assertFalse(EmailValidator.isValidEmail("om"))
    }

}

object EmailValidator{
    fun isValidEmail(email : String) : Boolean{
        return !email.isNullOrEmpty() && email.length > 3
    }
}

class ClassUnderTest(private val context: Context){
    fun getName() : String{
        return context.getString(R.string.lorem)
    }
}