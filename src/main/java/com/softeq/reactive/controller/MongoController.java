package com.softeq.reactive.controller;

import com.softeq.reactive.entity.Users;
import com.softeq.reactive.service.UserMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/mongo")
public class MongoController {

    UserMongoService service;

    @Autowired
    public MongoController(UserMongoService service) {
        this.service = service;
    }

    @GetMapping
    public Flux<Users> findAll(){
        return service.findAll();
    }



}
