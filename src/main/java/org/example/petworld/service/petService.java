package org.example.petworld.service;

import org.example.petworld.domain.pet;
import org.example.petworld.infrastructure.petRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class petService {
    private final petRepository petRepository;

    @Autowired
    public petService(petRepository petRepository) {
        this.petRepository = petRepository;
    }
    
    // === Functions of service ===

    public pet createPet(pet newpet) {
        return petRepository.save(newpet);
    }

    public List<pet> getAllPets() {
        return petRepository.findAll();

    }
}
