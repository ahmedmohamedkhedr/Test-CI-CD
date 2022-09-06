package com.arpuplus.testci

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class MainViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()

    private val viewModel = MainViewModel()


    @Test
    fun `test email given a value contains at symbol expected to be valid`(){
        viewModel.email = "aaaaaee.com"
        assertEquals(viewModel.validation.value,"valid")
    }

    @Test
    fun `test email given a value not contains at symbol expected to be invalid`(){
        viewModel.email = "aaaaaee.com"
        assertEquals(viewModel.validation.value,"invalid")
    }
}