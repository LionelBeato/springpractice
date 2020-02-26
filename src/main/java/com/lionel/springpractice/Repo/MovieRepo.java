package com.lionel.springpractice.Repo;

import com.lionel.springpractice.Model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie, Long> {

}
