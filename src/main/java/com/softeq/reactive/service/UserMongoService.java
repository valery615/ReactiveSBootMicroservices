package com.softeq.reactive.service;

import com.softeq.reactive.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserMongoService {

    @Autowired
    ReactiveMongoTemplate template;
    public Flux<User> findAll() {
        return template.findAll(User.class);
    }

    public Mono<User> save(Mono<User> user) {
        return template.save(user);
    }
}
