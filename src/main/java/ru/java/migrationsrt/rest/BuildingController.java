package ru.java.migrationsrt.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.java.migrationsrt.entity.Building;
import ru.java.migrationsrt.service.BuildingService;

import java.util.List;

@RestController
@RequestMapping(value = "/buildings", produces = MediaType.APPLICATION_JSON_VALUE)
public class BuildingController {
    private final BuildingService buildingService;

    public BuildingController(BuildingService buildingService) {
        this.buildingService = buildingService;
    }

    @GetMapping
    public List<Building> getAll() {
        return buildingService.getAll();
    }
}
