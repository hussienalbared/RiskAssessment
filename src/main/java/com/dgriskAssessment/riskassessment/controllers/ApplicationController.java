package com.dgriskAssessment.riskassessment.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@RestController
@RequestMapping("app")
public class ApplicationController {


    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping("/testApi")

    public String  testApiFunc( @RequestParam(value = "name", defaultValue = "World")String name) {
        /*List<?> movies = entityManager.createQuery("SELECT * from core.fsc_party_dim where change_current_ind='Y'")
                .getResultList();
        return movies;*/
        String  test= "Hi from controller  "+name;
        return test;
    }

}
