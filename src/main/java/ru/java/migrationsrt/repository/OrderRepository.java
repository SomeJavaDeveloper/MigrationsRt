package ru.java.migrationsrt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.java.migrationsrt.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
