package ru.java.migrationsrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.java.migrationsrt.entity.Car;

public interface CarRepository  extends JpaRepository<Car, Long> {
}
