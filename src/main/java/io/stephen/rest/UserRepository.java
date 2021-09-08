package io.stephen.rest;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<user, String> {
    
}
