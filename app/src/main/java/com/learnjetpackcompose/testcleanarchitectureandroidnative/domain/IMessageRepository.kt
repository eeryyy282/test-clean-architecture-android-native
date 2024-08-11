package com.learnjetpackcompose.testcleanarchitectureandroidnative.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String): MessageEntity
}