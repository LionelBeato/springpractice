package com.lionel.springpractice.Controller;

import com.lionel.springpractice.Repo.AnimalRepo;
import com.lionel.springpractice.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class BookController {
    @Autowired
    BookRepo bookRepo;

    // creating our get method for our animals repo
    // this aligns 1:1 with the HTTP GET method
    @RequestMapping( value = "/books", method= RequestMethod.GET)
    public ModelAndView getAnimals(){
        ModelAndView mav = new ModelAndView("books");
        mav.addObject("books", bookRepo.findAll());
        return mav;
    }
}
