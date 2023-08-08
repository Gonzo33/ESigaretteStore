package com.example.ESigaretteStore.mapper;

import com.example.ESigaretteStore.model.ESigarette;
import com.example.ESigaretteStore.dto.ESigaretteRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ESigaretteToDtoMapper {
    ESigarette AddESigaretteRequestToEsigarette(ESigaretteRequest eSigaretteRequest);

}
