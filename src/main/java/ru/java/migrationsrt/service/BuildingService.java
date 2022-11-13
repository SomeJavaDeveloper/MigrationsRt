package ru.java.migrationsrt.service;

import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.Building;
import ru.java.migrationsrt.repository.BuildingRepository;

import java.util.List;

@Service
public class BuildingService {
    private final BuildingRepository buildingRepository;

    public BuildingService(BuildingRepository buildingRepository) {
        this.buildingRepository = buildingRepository;
    }

    public List<Building> getAll() {
        return buildingRepository.findAll();
    }
}
