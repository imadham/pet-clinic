package com.imad.petclinicdata.repositories;

import com.imad.petclinicdata.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
