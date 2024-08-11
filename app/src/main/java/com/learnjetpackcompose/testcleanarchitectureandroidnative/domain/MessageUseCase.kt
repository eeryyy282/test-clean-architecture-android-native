package com.learnjetpackcompose.testcleanarchitectureandroidnative.domain

interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}