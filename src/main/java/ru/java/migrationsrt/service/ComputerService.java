package ru.java.migrationsrt.service;

import org.springframework.stereotype.Service;
import ru.java.migrationsrt.entity.Computer;
import ru.java.migrationsrt.repository.ComputerRepository;

import java.util.List;

@Service
public class ComputerService {
    private final ComputerRepository computerRepository;

    public ComputerService(ComputerRepository computerRepository) {
        this.computerRepository = computerRepository;
    }

    public List<Computer> getAll() {
        return computerRepository.findAll();
    }
}
