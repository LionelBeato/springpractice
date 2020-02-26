package com.lionel.springpractice.Controller;


import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller class with annotation, @RestController is a more fleshed out version of @Controller
@RestController
public class Controller {
    @Autowired
    BookRepo bookRepo;

    // exposing the endpoint "/hello" that will have the value of the return value of the hello() function
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World! My app works!";
    }

    @GetMapping("/books")
    public Iterable<Book> getBooks(){
        return bookRepo.findAll();
    }

}
