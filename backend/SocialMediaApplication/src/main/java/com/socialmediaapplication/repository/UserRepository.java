package com.socialmediaapplication.repository;

import com.socialmediaapplication.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
}
