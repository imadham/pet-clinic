package com.imad.petclinic.controllers;


//import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

@Controller
public class IndexController /*extends AcceptHeaderLocaleResolver*/ {

    //@Autowired
    //private HttpServletRequest request;

    @RequestMapping({"","/","index","index.html"})
    public String Index(){
        //Locale locale = this.resolveLocale(request);
        //System.out.println(locale);
        return "index";
    }

    @RequestMapping("/oups")
    public String oupsHandler(){
        return "notimplemented";
    }
}
