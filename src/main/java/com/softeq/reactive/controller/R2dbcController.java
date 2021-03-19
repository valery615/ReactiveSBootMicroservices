package com.softeq.reactive.controller;

import com.softeq.reactive.entity.Message;
import com.softeq.reactive.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/db")
public class R2dbcController {
    private final MessageService messageService;

    @Autowired
    public R2dbcController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/{id}")
    public Mono<Message> getMessageById(@PathVariable Integer id) {
        return messageService.getById(id);
    }

    @GetMapping
    public Flux<Message> findAll() {
        return messageService.findAll();
    }
}
