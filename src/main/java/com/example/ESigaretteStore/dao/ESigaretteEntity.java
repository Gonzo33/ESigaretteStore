package com.example.ESigaretteStore.dao;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESigarette", indexes = {
        @Index(name = "idx_esigarette_brand", columnList = "brand")
})
public class ESigaretteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String brand;

    private String name;

    private Double price;
}