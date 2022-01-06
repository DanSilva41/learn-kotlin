package com.silva.learn_kotlin.packages.other

import org.junit.jupiter.api.Test

internal class SmsMessageTest {

    @Test
    fun shouldExecuteWithSuccess() {
        val smsMessage = SmsMessage("user", "Hello, are you?")
        smsMessage.execute()
    }
}