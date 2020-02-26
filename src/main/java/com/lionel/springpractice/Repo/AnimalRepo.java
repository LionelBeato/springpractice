package com.lionel.springpractice.Repo;

import com.lionel.springpractice.Model.Animal;
import org.springframework.data.repository.CrudRepository;


// simple interface that extends CrudRepository
// CrudRepository has a generic type that we can pass a model into
public interface AnimalRepo extends CrudRepository <Animal, Long> {
}
