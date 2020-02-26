package com.lionel.springpractice.Controller;


import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
import com.lionel.springpractice.Repo.AnimalRepo;
import com.lionel.springpractice.Repo.BookRepo;
import com.lionel.springpractice.Repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

// controller class with annotation, @RestController is a more fleshed out version of @Controller
@RestController
public class Controller {
    @Autowired
    BookRepo bookRepo;

    @Autowired
    MovieRepo movieRepo;

    // Autowired allows us to avoid constructing an object
    // think of it as dependency injection
    @Autowired
    AnimalRepo animalRepo;


    // exposing the endpoint "/hello" that will have the value of the return value of the hello() function
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World! My app works!";
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks(){
        return bookRepo.findAll();
    }

    @GetMapping("/movies")
    public Iterable<Movie> getMovies(){
        return movieRepo.findAll();
    }

    // creating our get method for our animals repo
    // this aligns 1:1 with the HTTP GET method
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView getAnimals(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("animals", animalRepo.findAll());
        return mav;
    }

    @GetMapping({"/name"})
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", name);
        return "name";
    }

}
