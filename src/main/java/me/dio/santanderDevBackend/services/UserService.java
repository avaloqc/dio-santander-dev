package me.dio.santanderDevBackend.services;

import me.dio.santanderDevBackend.domain.models.User;

public interface UserService {
    
    User findById(Long id);

    User create(User newUser);

}