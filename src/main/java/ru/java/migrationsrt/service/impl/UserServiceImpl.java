package ru.java.migrationsrt.service.impl;

import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.User;
import ru.java.migrationsrt.repository.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }
}
