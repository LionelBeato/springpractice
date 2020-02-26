package com.lionel.springpractice.Controller;


import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
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

}
