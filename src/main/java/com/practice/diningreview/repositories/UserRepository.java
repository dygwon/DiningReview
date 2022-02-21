package com.practice.diningreview.repositories;

import java.util.Optional;

import com.practice.diningreview.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
