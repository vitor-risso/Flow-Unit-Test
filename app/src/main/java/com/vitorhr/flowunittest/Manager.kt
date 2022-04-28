package com.vitorhr.flowunittest

class Manager(private val flowInt: FlowInt) {

    suspend fun callFlowIntOneToTen()  = flowInt.returnFromOneToTen()

}