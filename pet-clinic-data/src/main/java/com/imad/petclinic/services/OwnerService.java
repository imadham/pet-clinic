package com.imad.petclinic.services;

import com.imad.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);
    Owner findByLasrName(String lastName);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
