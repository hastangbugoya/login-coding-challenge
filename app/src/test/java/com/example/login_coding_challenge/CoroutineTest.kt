package com.example.login_coding_challenge

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.login_coding_challenge.viewmodel.TestCoroutineRule
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Rule
import org.junit.rules.TestRule

@ExperimentalCoroutinesApi
abstract class CoroutineTest {

    @get:Rule
    val testInstantTaskExecutorRule: TestRule = InstantTaskExecutorRule()

    @get:Rule
    val testCoroutineRule = TestCoroutineRule()
}