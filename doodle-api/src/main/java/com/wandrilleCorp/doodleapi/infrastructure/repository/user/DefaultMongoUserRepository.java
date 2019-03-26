package com.wandrilleCorp.doodleapi.infrastructure.repository.user;

import com.wandrilleCorp.doodleapi.domain.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DefaultMongoUserRepository extends MongoRepository<User, String> {
    User findByName(String name);

    Optional<User> findById(String id);
}
