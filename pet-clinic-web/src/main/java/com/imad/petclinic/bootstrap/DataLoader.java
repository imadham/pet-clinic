package com.imad.petclinic.bootstrap;

import com.imad.petclinic.model.*;
import com.imad.petclinic.services.OwnerService;
import com.imad.petclinic.services.PetTypeService;
import com.imad.petclinic.services.SpecialtyService;
import com.imad.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();
        if(count == 0){
        loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedPetDogType = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");
        PetType savedPetCatType = petTypeService.save(cat);

        Specialty radiology = new Specialty();
        radiology.setDescription("readiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty surgery = new Specialty();
        surgery.setDescription("surgery");
        Specialty savedSurgery = specialtyService.save(surgery);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Imad");
        owner1.setLastName("Hamameh");
        owner1.setAddress("11-я Парковая, 36");
        owner1.setCity("Moscow");
        owner1.setTelephone("+7-977-302-68-79");

        Pet imadsPet = new Pet();
        imadsPet.setPetType(savedPetCatType);
        imadsPet.setOwner(owner1);
        imadsPet.setBirthDate(LocalDate.now());
        imadsPet.setName("mars");
        owner1.getPets().add(imadsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ali");
        owner2.setLastName("Ali");
        owner2.setAddress("11-я Парковая 12456");
        owner2.setCity("Moscow");
        owner2.setTelephone("+7-111-111-11-11");


        Pet aliPet = new Pet();
        aliPet.setPetType(savedPetDogType);
        aliPet.setOwner(owner2);
        aliPet.setBirthDate(LocalDate.now());
        aliPet.setName("ali's dog");
        owner2.getPets().add(aliPet);

        ownerService.save(owner2);

        System.out.println("Loading owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Majd");
        vet1.setLastName("Ah");
        vet1.getSpecialties().add(savedRadiology);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Ahmad");
        vet2.setLastName("mh");
        vet2.getSpecialties().add(savedSurgery);

        vetService.save(vet2);

        System.out.println("Loading vets...");
    }
}
