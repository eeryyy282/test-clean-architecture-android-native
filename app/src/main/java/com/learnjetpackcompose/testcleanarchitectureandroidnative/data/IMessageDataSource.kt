package com.learnjetpackcompose.testcleanarchitectureandroidnative.data

import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}