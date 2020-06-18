package com.imad.petclinic.services.map;

import com.imad.petclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    OwnerMapService ownerMapService;

    Long ownerId = 1L;

    String lastName = "imad";

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());
        ownerMapService.save(Owner.builder().id(ownerId).lastName(lastName).build());

    }

    @Test
    void findAll() {
        Set<Owner> owners = ownerMapService.findAll();
        assertEquals(owners.size(),1);
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(ownerId);

        assertEquals(ownerId, owner.getId());
    }

    @Test
    void deleteById() {

        ownerMapService.deleteById(ownerId);

        assertEquals(0,ownerMapService.findAll().size());


    }

    @Test
    void delete() {

        ownerMapService.delete(ownerMapService.findById(ownerId));

        assertEquals(0,ownerMapService.findAll().size());
    }

    @Test
    void saveWithId() {

        Long id = 2L;

        Owner owner = Owner.builder().id(id).build();
        Owner savedOwner = ownerMapService.save(owner);
        assertEquals(id, savedOwner.getId());
    }

    @Test
    void findByLastName() {

        Owner imad = ownerMapService.findByLastName(lastName);

        assertNull(imad);

        assertEquals(ownerId,imad.getId());
    }

    @Test
    void findByLastNameNotFound() {

        Owner imad = ownerMapService.findByLastName("123");

        assertNull(imad);

    }

    @Test
    void saveWithoutNoId(){
        Owner owner = ownerMapService.save(Owner.builder().build());

        assertNotNull(owner);
        assertNotNull(owner.getId());
    }
}