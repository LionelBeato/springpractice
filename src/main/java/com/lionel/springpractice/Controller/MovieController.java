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
public class MovieController {


    @Autowired
    MovieRepo movieRepo;

    // Autowired allows us to avoid constructing an object
    // think of it as dependency injection


    // exposing the endpoint "/hello" that will have the value of the return value of the hello() function
//    @RequestMapping("/hello")
//    public String hello(){
//        return "Hello World! My app works!";
//    }

//    @GetMapping("/books")
//    public Iterable<Book> getBooks(){
//        return bookRepo.findAll();
//    }

//    @GetMapping("/movies")
//    public Iterable<Movie> getMovies(){
//        return movieRepo.findAll();
//    }

    @RequestMapping(value = "/movies", method=RequestMethod.GET)
    public ModelAndView getMovies(){
        ModelAndView mav = new ModelAndView("movies");
        mav.addObject("movies", movieRepo.findAll());
        return mav;
    }




//    @GetMapping({"/name"})
//    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
//        model.addAttribute("name", name);
//        return "name";
//    }

}
