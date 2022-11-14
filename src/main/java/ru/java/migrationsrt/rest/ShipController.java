package ru.java.migrationsrt.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.java.migrationsrt.entity.Ship;
import ru.java.migrationsrt.service.ShipService;

import java.util.List;

@RestController
@RequestMapping(value = "/ships", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShipController {
    private final ShipService shipService;

    public ShipController(ShipService shipService) {
        this.shipService = shipService;
    }

    @GetMapping
    public List<Ship> getAll() {
        return shipService.getAll();
    }
}
