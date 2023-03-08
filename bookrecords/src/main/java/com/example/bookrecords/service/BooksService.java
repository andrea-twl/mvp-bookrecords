package com.example.bookrecords.service;

import com.example.bookrecords.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<List<Object>> getTop3ReadBook() {
        return this.booksRepository.getTop3ReadBook();
    }
}
