package com.uvt.sp.controllers;

import com.uvt.sp.classes.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.uvt.sp.repositories.BookRepository;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/book")
    public List<Book> getBooks(){
        return this.bookRepository.findAll();
    }
}
