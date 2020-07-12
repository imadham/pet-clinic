package com.imad.petclinicdata.repositories;

import com.imad.petclinicdata.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
