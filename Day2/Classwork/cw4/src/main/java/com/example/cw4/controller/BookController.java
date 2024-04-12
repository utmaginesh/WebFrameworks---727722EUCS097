package com.example.cw4.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cw4.model.Book;

@RestController
public class BookController {
    @GetMapping("/book")
    public Book getBook(){
        Book book = new Book("The Great Soldier","G. Gyan");
        return book;
    }
}
