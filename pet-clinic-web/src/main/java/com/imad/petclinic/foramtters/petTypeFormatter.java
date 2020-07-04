package com.imad.petclinic.foramtters;

import com.imad.petclinic.model.PetType;
import com.imad.petclinic.services.PetTypeService;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Collection;
import java.util.Locale;


@Component
public class petTypeFormatter implements Formatter<PetType> {

    private final PetTypeService petTypeService;

    public petTypeFormatter(PetTypeService petTypeService) {
        this.petTypeService = petTypeService;
    }

    @Override
    public String print(PetType petType, Locale locale){
        return petType.getName();
    }

    @Override
    public PetType parse(String text, Locale locale) throws ParseException {
        Collection<PetType> petTypes = petTypeService.findAll();
        for (PetType petType : petTypes){
            if(petType.getName().equals(text)){
                return petType;
            }
        }
        throw new ParseException("type not found for" + text,0);
    }
}
