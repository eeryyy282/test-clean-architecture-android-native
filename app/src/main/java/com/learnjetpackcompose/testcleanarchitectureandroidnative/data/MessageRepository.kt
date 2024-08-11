package com.learnjetpackcompose.testcleanarchitectureandroidnative.data

import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.IMessageRepository
import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity =
        messageDataSource.getMessageFromSource(name)
}