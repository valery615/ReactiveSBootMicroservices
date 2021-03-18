package com.softeq.reactive.service;

import com.softeq.reactive.entity.Message;
import com.softeq.reactive.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {


    private final MessageRepository messageRepository;
    
    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Mono<Message> getById(Integer id){
        return messageRepository.findById(id);
    }

    public Flux<Message> findAll(){
        return messageRepository.findAll();
    }
}
