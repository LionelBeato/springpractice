package com.lionel.springpractice.Repo;


import com.lionel.springpractice.Model.Book;
import org.springframework.data.repository.CrudRepository;


public interface BookRepo extends CrudRepository <Book, Long> {

}
