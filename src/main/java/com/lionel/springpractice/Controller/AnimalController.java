package com.lionel.springpractice.Controller;

import com.lionel.springpractice.Service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AnimalController {


    @Autowired
    AnimalService animalService;
    // creating our get method for our animals repo
    // this aligns 1:1 with the HTTP GET method
    @RequestMapping( value = "/animals", method= RequestMethod.GET)
    ModelAndView getAnimals(){
        return animalService.getAnimals();
    }


}
