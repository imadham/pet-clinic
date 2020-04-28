package com.imad.petclinic.services;

import com.imad.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLasrName(String lastName);

}
