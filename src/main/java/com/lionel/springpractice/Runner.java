package com.lionel.springpractice;

import com.lionel.springpractice.Model.Animal;
import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
import com.lionel.springpractice.Repo.AnimalRepo;
import com.lionel.springpractice.Repo.BookRepo;
import com.lionel.springpractice.Repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//CommandLineRunner lets you write instructions for the program at the start of runtime
@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private MovieRepo movieRepo;

    @Autowired
    private AnimalRepo animalRepo;

    // this run method will resolve at the start of your programs runtime
    @Override
    public void run(String... args) throws Exception {
        bookRepo.save(new Book("Slaughterhouse-Five", 1969));
        bookRepo.save(new Book("1984", 1949));

        movieRepo.save(new Movie("Toy Story", 1995, "family"));


        // this is calling the save method in my repo to create two new objects
        animalRepo.save(new Animal("Cheetah", "https://pbs.twimg.com/profile_images/1050103669507657734/SBAh4Yg0_400x400.jpg"));
        animalRepo.save(new Animal("Zebra", "https://i0.wp.com/metro.co.uk/wp-content/uploads/2018/07/sei_23061689-e184.jpg"));

    }
}
