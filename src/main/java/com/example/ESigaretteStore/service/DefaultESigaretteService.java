package com.example.ESigaretteStore.service;

import com.example.ESigaretteStore.model.ESigarette;
import com.example.ESigaretteStore.dao.ESigaretteEntity;
import com.example.ESigaretteStore.dao.ESigaretteRepository;
import com.example.ESigaretteStore.exception.ESigaretteNotFoundException;
import com.example.ESigaretteStore.mapper.ESigaretteToEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DefaultESigaretteService implements ESigaretteService {
    private final ESigaretteRepository eSigaretteRepository;
    private final ESigaretteToEntityMapper mapper;

    @Override
    public ESigarette getESigaretteById(Long id) {
        ESigaretteEntity eSigaretteEntity = eSigaretteRepository
                .findById(id)
                .orElseThrow(() -> new ESigaretteNotFoundException("ESigarette not found: id = " + id));

        return mapper.eSigaretteEntityToESigarette(eSigaretteEntity);
    }

    @Override
    public List<ESigarette> getAllESigarettes() {
        Iterable<ESigaretteEntity> iterable = eSigaretteRepository.findAll();
        ArrayList<ESigarette> eSigarettes = new ArrayList<>();
        for (ESigaretteEntity eSigaretteEntity : iterable) {
            eSigarettes.add(mapper.eSigaretteEntityToESigarette(eSigaretteEntity));
        }

        return eSigarettes;
    }
//    @Override
//    public List<ESigarette> findByBrand(String brand) {
//        Iterable<ESigaretteEntity> iterable = eSigaretteRepository.findAllByBrandContaining(brand);
//        return StreamSupport.stream(iterable.spliterator(), false)
//                .map(mapper::eSigaretteEntityToESigarette)
//                .collect(Collectors.toList());
//    }

    @Override
    public void addESigarette(ESigarette esigarette) {
        ESigaretteEntity eSigaretteEntity = mapper.eSigaretteToESigaretteEntity(esigarette);
        eSigaretteRepository.save(eSigaretteEntity);
    }

//    @Override
//    public void editESigarette(ESigarette esigarette) {
//        if (!eSigaretteRepository.existsById(esigarette.getId()))
//            throw new ESigaretteNotFoundException("ESigarette not found: id = " + esigarette.getId());
//
//        ESigaretteEntity eSigaretteEntity = mapper.eSigaretteToESigaretteEntity(esigarette);
//        eSigaretteRepository.save(eSigaretteEntity);
//
//    }
}
