package org.example.petworld.infrastructure;

import org.example.petworld.domain.pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface petRepository extends JpaRepository<pet, Long> {}
