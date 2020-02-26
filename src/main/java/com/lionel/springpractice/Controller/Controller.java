package com.lionel.springpractice.Controller;


import com.lionel.springpractice.Model.Animal;
import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
import com.lionel.springpractice.Repo.AnimalRepo;
import com.lionel.springpractice.Repo.BookRepo;
import com.lionel.springpractice.Repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping("/animals")
    public Iterable<Animal> getAnimals(){
        return animalRepo.findAll();
    }

}
