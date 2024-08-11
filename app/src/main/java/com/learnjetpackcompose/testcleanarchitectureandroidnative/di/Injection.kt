package com.learnjetpackcompose.testcleanarchitectureandroidnative.di

import com.learnjetpackcompose.testcleanarchitectureandroidnative.data.IMessageDataSource
import com.learnjetpackcompose.testcleanarchitectureandroidnative.data.MessageDataSource
import com.learnjetpackcompose.testcleanarchitectureandroidnative.data.MessageRepository
import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.IMessageRepository
import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.MessageInteractor
import com.learnjetpackcompose.testcleanarchitectureandroidnative.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)

    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}