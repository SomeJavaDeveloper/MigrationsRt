package ru.java.migrationsrt.service;

import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.Car;
import ru.java.migrationsrt.repository.CarRepository;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAll() {
        return carRepository.findAll();
    }
}
