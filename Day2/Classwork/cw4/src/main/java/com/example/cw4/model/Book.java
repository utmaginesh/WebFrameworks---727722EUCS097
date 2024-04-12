package com.example.cw4.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Book {
    public String title;
    public String author;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    public Date publicationDate;
    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.publicationDate = new Date();
    }
}
