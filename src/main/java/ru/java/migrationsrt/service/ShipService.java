package ru.java.migrationsrt.service;

import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.Ship;
import ru.java.migrationsrt.repository.ShipRepository;

import java.util.List;

@Service
public class ShipService {
    private final ShipRepository shipRepository;

    public ShipService(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    public List<Ship> getAll() {
        return shipRepository.findAll();
    }
}
