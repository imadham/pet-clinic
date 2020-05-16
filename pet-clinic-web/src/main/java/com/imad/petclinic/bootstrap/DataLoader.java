package com.imad.petclinic.bootstrap;

import com.imad.petclinic.model.Owner;
import com.imad.petclinic.model.PetType;
import com.imad.petclinic.model.Vet;
import com.imad.petclinic.services.OwnerService;
import com.imad.petclinic.services.PetTypeService;
import com.imad.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedPetDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedPetCatType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Imad");
        owner1.setLastName("Hamameh");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ali");
        owner2.setLastName("Ali");

        ownerService.save(owner2);

        System.out.println("Loading owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Majd");
        vet1.setLastName("Ah");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ahmad");
        vet2.setLastName("mh");

        vetService.save(vet2);

        System.out.println("Loading vets...");


    }
}
