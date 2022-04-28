package com.vitorhr.flowunittest

import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class ManagerTest {

    @MockK
    private lateinit var flowInt: FlowInt

    private lateinit var manager: Manager

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)

        manager = Manager(flowInt)
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }

    @Test
    fun `when call flowInt should return one to ten`() = runTest {
        // Arrange
        val expectedResult = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        // Mock
        coEvery {
            flowInt.returnFromOneToTen()
        } returns flow {
            emit(1)
            emit(2)
            emit(3)
            emit(4)
            emit(5)
            emit(6)
            emit(7)
            emit(8)
            emit(9)
            emit(10)
        }

        // Act
        val result = manager.callFlowIntOneToTen().toList()

        // Assert
        assertEquals(expectedResult, result)

    }
}