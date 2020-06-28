package com.imad.petclinic.controllers;

import com.imad.petclinic.model.Owner;
import com.imad.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Set;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

//    @RequestMapping({"", "/index", "/index.html"})
//    public String listOwners(Model model){
//
//        model.addAttribute("owners",ownerService.findAll());
//        return "owners/index";
//    }

    @GetMapping({"", "/index", "/index.html"})
    public ModelAndView listOwners(){
        ModelAndView mav = new ModelAndView("owners/index");
        Set<Owner> ownerSet = ownerService.findAll();
        mav.addObject("owners", ownerSet);

        return mav;
    }

    @RequestMapping({"/find", "/find.html"})
    public String findOwners(){
        return "notimplemented";
    }

    @GetMapping("/{ownerId}")
    public ModelAndView showOwner(@PathVariable("ownerId") Long ownerId) {
        ModelAndView mav = new ModelAndView("owners/ownerDetails");
        Owner owner = ownerService.findById(ownerId);
        mav.addObject(owner);
        return mav;
    }
}
