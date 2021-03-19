package com.softeq.reactive.service;

import com.softeq.reactive.entity.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.R2dbcEntityOperations;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private final R2dbcEntityOperations r2dbcEntityTemplate;

    @Autowired
    public MessageService(R2dbcEntityOperations r2dbcEntityTemplate) {
        this.r2dbcEntityTemplate = r2dbcEntityTemplate;
    }

    public Mono<Message> getById(Integer id){
    return r2dbcEntityTemplate.select(Query.query(Criteria.where("id").is(id)), Message.class).take(1L).single();
    }

    public Flux<Message> findAll(){
        return r2dbcEntityTemplate.select(Message.class).all();
    }
}
