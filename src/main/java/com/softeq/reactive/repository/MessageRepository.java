package com.softeq.reactive.repository;

import com.softeq.reactive.entity.Message;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface MessageRepository extends ReactiveCrudRepository<Message, Integer> {
    @Query("SELECT * FROM message WHERE id= :integer")
    Mono<Message> findById(Integer integer);
}
