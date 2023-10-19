package me.dio.santanderDevBackend.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.santanderDevBackend.domain.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}