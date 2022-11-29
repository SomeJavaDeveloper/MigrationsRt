package ru.java.migrationsrt.service;

import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.Order;
import ru.java.migrationsrt.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }
}
