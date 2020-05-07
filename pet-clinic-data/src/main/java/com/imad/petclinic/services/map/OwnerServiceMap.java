package com.imad.petclinic.services.map;

import com.imad.petclinic.model.Owner;
import com.imad.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById( id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        super.save(object.getId(),object);
        return object;
    }

    @Override
    public Owner findByLasrName(String lastName) {
        return null;
    }
}
