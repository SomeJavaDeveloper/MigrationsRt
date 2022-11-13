package ru.java.migrationsrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.java.migrationsrt.entity.Computer;

public interface ComputerRepository extends JpaRepository<Computer, Long> {
}
