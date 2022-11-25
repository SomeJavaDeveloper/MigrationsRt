package ru.java.migrationsrt.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.java.migrationsrt.entity.Car;
import ru.java.migrationsrt.service.CarService;

import java.util.List;

@RestController
@RequestMapping(value = "/cars", produces = MediaType.APPLICATION_JSON_VALUE)
@Tag(name = "Контроллер машин", description = "Позволяет управлять записями о машинах")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    @Operation(description = "Получить список всех машин", method = "GET")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Car.class))}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content),
    })
    public List<Car> getAll() {
        return carService.getAll();
    }

    @GetMapping("/{id}")
    @Operation(description = "Получить машину по id", method = "GET")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK",
                    content = {@Content(mediaType = MediaType.APPLICATION_JSON_VALUE,
                            schema = @Schema(implementation = Car.class))}),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = @Content),
    })
    public Car getById(@PathVariable(name = "id") Long id) {
        return carService.getById(id);
    }
}
