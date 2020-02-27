package com.lionel.springpractice.Controller;

import com.lionel.springpractice.Repo.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class AnimalController {
    @Autowired
    AnimalRepo animalRepo;

    // creating our get method for our animals repo
    // this aligns 1:1 with the HTTP GET method
    @RequestMapping( value = "/animals", method= RequestMethod.GET)
    public ModelAndView getAnimals(){
        ModelAndView mav = new ModelAndView("animals");
        mav.addObject("animals", animalRepo.findAll());
        return mav;
    }

}
