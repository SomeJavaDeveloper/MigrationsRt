package ru.java.migrationsrt.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @Schema(description = "Идентификатор машины", example = "1")
    private Long id;
    @Column(name = "model_name", nullable = false, unique = true, updatable = false)
    @NotBlank
    @Size(min = 1, max = 30)
    @Schema(description = "Название моедли", example = "Vesta", minLength = 1, maxLength = 30)
    private String modelName;
    @Column(name = "horse_powers", nullable = false)
    @NotBlank
    @Schema(description = "Лошадиные силы", example = "120", minimum = "1", maximum = "2000")
    private Integer horsePowers;
}
