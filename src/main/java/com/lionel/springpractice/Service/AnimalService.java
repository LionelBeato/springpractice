package com.lionel.springpractice.Service;

import com.lionel.springpractice.Repo.AnimalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class AnimalService {

    @Autowired
    AnimalRepo animalRepo;


    public ModelAndView getAnimals(){
        ModelAndView mav = new ModelAndView("animals");
        mav.addObject("animals", animalRepo.findAll());
        return mav;
    }


}
