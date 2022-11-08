package ru.java.migrationsrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.java.migrationsrt.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
