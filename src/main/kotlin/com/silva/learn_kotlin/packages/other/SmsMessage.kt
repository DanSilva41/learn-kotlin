package com.silva.learn_kotlin.packages.other

import com.silva.learn_kotlin.packages.someFunction
import com.silva.learn_kotlin.packages.Message as testMessage

class SmsMessage(name: String, text: String) : testMessage(name, text) {

    fun execute() = someFunction()
}