package com.vitorhr.flowunittest

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow

class TimeOutWithFlow {
    suspend fun timeoutFlow() = channelFlow<Int> {
        // NOT YET IMPLEMENTED
    }
}