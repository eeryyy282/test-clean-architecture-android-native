package com.learnjetpackcompose.testcleanarchitectureandroidnative.domain

interface MessageUserCase {
    fun getMessage(name: String): MessageEntity
}