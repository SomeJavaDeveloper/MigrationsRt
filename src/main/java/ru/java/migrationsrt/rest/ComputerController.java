package ru.java.migrationsrt.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.java.migrationsrt.entity.Computer;
import ru.java.migrationsrt.service.ComputerService;

import java.util.List;

@RestController
@RequestMapping(value = "/computers", produces = MediaType.APPLICATION_JSON_VALUE)
public class ComputerController {
    private final ComputerService computerService;

    public ComputerController(ComputerService computerService) {
        this.computerService = computerService;
    }

    @GetMapping
    public List<Computer> getAll() {
        return computerService.getAll();
    }
}
