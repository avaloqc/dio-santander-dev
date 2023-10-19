package me.dio.santanderDevBackend.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santanderDevBackend.domain.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}