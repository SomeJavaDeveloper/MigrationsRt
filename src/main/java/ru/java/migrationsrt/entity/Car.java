package ru.java.migrationsrt.entity;

import lombok.*;

import javax.persistence.*;

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
    private Long id;
    @Column(name = "model_name", nullable = false, unique = true, updatable = false)
    private String modelName;
    @Column(name = "horse_powers", nullable = false)
    private Integer horsePowers;
}
