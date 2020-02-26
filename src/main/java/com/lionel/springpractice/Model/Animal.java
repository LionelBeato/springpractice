package com.lionel.springpractice.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// this annotation lets the program know that this is your model
@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    // we have a standard constructor with parameters in order to create custom objects
    public Animal(String name) {
        this.name = name;
    }

    // we need a default constructor in order for our model to work
    public Animal(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
