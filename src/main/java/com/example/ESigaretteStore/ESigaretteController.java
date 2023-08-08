package com.example.ESigaretteStore;

import com.example.ESigaretteStore.dto.ESigaretteRequest;
import com.example.ESigaretteStore.mapper.ESigaretteToDtoMapper;
import com.example.ESigaretteStore.model.ESigarette;
import com.example.ESigaretteStore.service.ESigaretteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/books")
@RequiredArgsConstructor
public class ESigaretteController {


    private final ESigaretteService eSigaretteService;

    private final ESigaretteToDtoMapper mapper;


    @GetMapping("/{id}")
    public ESigarette getESigaretteById(@PathVariable Long id) {
        return eSigaretteService.getESigaretteById(id);
    }

    @GetMapping
    public List<ESigarette> getAllESigarettes() {
        return eSigaretteService.getAllESigarettes();
    }

    @PostMapping
    public void addESigarette(@RequestBody ESigaretteRequest request) {
        eSigaretteService.addESigarette(mapper.AddESigaretteRequestToEsigarette(request));
    }


//    @PutMapping("/{id}")
//    public void editESigarette(@PathVariable Long id, @RequestBody ESigaretteRequest request) {
//        eSigaretteService.editESigarette(mapper.EditESigaretteRequestToESigarette(id, request));
//    }
}
