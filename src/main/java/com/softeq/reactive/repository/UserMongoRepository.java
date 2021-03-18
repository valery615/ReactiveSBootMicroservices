package com.softeq.reactive.repository;

import com.softeq.reactive.entity.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.relational.core.sql.In;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMongoRepository extends ReactiveMongoRepository<User, Integer> {
}
