package com.softeq.reactive.service;

import com.softeq.reactive.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class UserMongoService {

    @Autowired
    ReactiveMongoTemplate template;
    public Flux<Users> findAll() {
        return template.findAll(Users.class);
    }

    public Mono<Users> save(Mono<Users> user) {
        return template.save(user);
    }
}
