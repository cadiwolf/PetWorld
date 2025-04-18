package org.example.petworld.application;

import org.example.petworld.domain.pet;
import org.example.petworld.service.petService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pet")
public class petController {
    private final petService petService;

    @Autowired
    public petController(petService petService) {
        this.petService = petService;
    }

    // === Endpoints ===
    @PostMapping("/create")
    public ResponseEntity<pet> createPetController(@RequestBody pet newpet) {
        pet createdPet = petService.createPet(newpet);
        return new ResponseEntity<>(createdPet, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<pet>> getAllPetController() {
        List<pet> Pets = petService.getAllPets();
        return new ResponseEntity<>(Pets, HttpStatus.OK);
    }
}
