package com.lionel.springpractice;

import com.lionel.springpractice.Model.Book;
import com.lionel.springpractice.Model.Movie;
import com.lionel.springpractice.Repo.BookRepo;
import com.lionel.springpractice.Repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private BookRepo bookRepo;

    @Autowired
    private MovieRepo movieRepo;

    @Override
    public void run(String... args) throws Exception {
        bookRepo.save(new Book("Slaughterhouse-Five", 1969));
        bookRepo.save(new Book("1984", 1949));

        movieRepo.save(new Movie("Toy Story", 1995, "family"));

    }
}
