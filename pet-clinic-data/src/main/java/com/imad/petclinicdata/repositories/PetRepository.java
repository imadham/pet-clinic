package com.imad.petclinicdata.repositories;

import com.imad.petclinicdata.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
