package ru.java.migrationsrt.service;

import lombok.NonNull;
import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.Car;
import ru.java.migrationsrt.repository.CarRepository;

import java.util.List;

@Service
public class CarService {
    private final String HIVE_NOT_FOUND = "Машина с id=%s не найдена";
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAll() {
        return carRepository.findAll();
    }

    public Car getById(@NonNull Long id) {
        return carRepository.findById(id).orElseThrow(() -> new RuntimeException(String.format(HIVE_NOT_FOUND, id)));
    }
}
