package ru.java.migrationsrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.java.migrationsrt.entity.Building;

public interface BuildingRepository extends JpaRepository<Building, Long> {
}
