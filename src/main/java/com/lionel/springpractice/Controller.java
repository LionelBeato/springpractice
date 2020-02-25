package com.lionel.springpractice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller class with annotation, @RestController is a more fleshed out version of @Controller
@RestController
public class Controller {

    // exposing the endpoint "/hello" that will have the value of the return value of the hello() function
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World! My app works!";
    }

}
