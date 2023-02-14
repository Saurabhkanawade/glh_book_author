package com.glh.glhbookauthor.service;

import com.glh.glhbookauthor.entity.BookEntity;
import com.glh.glhbookauthor.model.BookRequest;
import com.glh.glhbookauthor.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

//    public List<BookRequest> getBooks() {
////        List<BookEntity> bookRequests=bookRepository.findAll();
////        return
//    }
}
