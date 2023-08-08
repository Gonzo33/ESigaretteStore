package com.example.ESigaretteStore.mapper;

import com.example.ESigaretteStore.model.ESigarette;
import com.example.ESigaretteStore.dao.ESigaretteEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ESigaretteToEntityMapper {
    ESigaretteEntity eSigaretteToESigaretteEntity(ESigarette eSigarette);

    ESigarette eSigaretteEntityToESigarette(ESigaretteEntity eSigaretteEntity);
}
