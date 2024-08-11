package com.learnjetpackcompose.testcleanarchitectureandroidnative.data

import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Clean Architecture Here!")
}