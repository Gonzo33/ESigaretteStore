package com.example.ESigaretteStore.service;

import com.example.ESigaretteStore.model.ESigarette;

import java.util.List;

public interface ESigaretteService {
    ESigarette getESigaretteById(Long id);
    List<ESigarette> getAllESigarettes();
//    List<ESigarette> findByBrand(String brand);
    void addESigarette(ESigarette esigarette);
//    void editESigarette(ESigarette esigarette);
}
