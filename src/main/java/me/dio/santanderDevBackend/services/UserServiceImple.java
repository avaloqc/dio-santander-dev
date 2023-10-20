package me.dio.santanderDevBackend.services;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.santanderDevBackend.domain.models.User;
import me.dio.santanderDevBackend.domain.repository.UserRepository;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImple(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User newUser) {
        if (newUser.getId() != null && userRepository.existsById(newUser.getId())) {
            throw new IllegalArgumentException("This user ID is already exists.");
        }
        if (userRepository.existsByAccountUsername(newUser.getAccount().getUsername())) {
            throw new IllegalArgumentException("This Account username already exists.");
        }
        return userRepository.save(newUser);
    }

}