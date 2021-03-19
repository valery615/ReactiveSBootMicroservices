package com.softeq.reactive.repository;

import com.softeq.reactive.entity.Users;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends ReactiveMongoRepository<Users, Integer> {
}
