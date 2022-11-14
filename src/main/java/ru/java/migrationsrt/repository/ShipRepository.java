package ru.java.migrationsrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.java.migrationsrt.entity.Ship;

public interface ShipRepository extends JpaRepository<Ship, Long> {
}
