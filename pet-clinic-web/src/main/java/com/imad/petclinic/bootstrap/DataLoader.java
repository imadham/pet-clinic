package com.imad.petclinic.bootstrap;

import com.imad.petclinic.model.Owner;
import com.imad.petclinic.model.Vet;
import com.imad.petclinic.services.OwnerService;
import com.imad.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

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
        vet1.setId(1L);
        vet1.setFirstName("Majd");
        vet1.setLastName("Ah");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ahmad");
        vet2.setLastName("mh");

        vetService.save(vet2);

        System.out.println("Loading vets...");


    }
}
