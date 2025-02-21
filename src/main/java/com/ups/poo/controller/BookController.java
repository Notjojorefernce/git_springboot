package com.ups.poo.controller;

import com.ups.poo.domain.Book;
import com.ups.poo.service.BookService;
import com.ups.poo.dto.BookDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/all-book")
    public ResponseEntity findAllBooks() {
        List<BookDto> booklist = new ArrayList<>();
        booklist = bookService.findAll();
        return new ResponseEntity(booklist, HttpStatus.OK);

    }

}