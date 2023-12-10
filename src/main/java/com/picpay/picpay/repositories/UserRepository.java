package com.picpay.picpay.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.picpay.domain.user.User;

public interface UserRepository extends JpaRepository<User, UUID>{
    Optional<User> findByDocument(String document);
    Optional<User> findById(UUID id);    
}
