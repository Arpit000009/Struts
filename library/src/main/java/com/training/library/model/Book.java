package com.training.library.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String author;
  
    private double price;

    // getters and setters
    
    
}