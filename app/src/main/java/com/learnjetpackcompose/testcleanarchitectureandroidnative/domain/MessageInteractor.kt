package com.learnjetpackcompose.testcleanarchitectureandroidnative.domain

class MessageInteractor(
    private val messageRepository: IMessageRepository
) : MessageUserCase {
    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }

}