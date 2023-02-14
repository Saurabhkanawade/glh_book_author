package com.glh.glhbookauthor.controller;

import com.glh.glhbookauthor.model.BookRequest;
import com.glh.glhbookauthor.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

//    @GetMapping
//    public List<BookRequest> getBooks(){
//        return bookService.getBooks();
//    }
}
