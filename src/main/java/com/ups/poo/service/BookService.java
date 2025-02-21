package com.ups.poo.service;

import com.ups.poo.domain.Book;
import com.ups.poo.dto.AuthorDto;
import com.ups.poo.repository.BookRepository;
import com.ups.poo.dto.BookDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<BookDto> findAll() {
        List<BookDto> bookList = new ArrayList<>();
        Iterable<Book> books = bookRepository.findAll();
        for (Book bookI : books) {
            BookDto book = new BookDto();
            book.setTitle(bookI.getTitle());
            book.setEditorial(bookI.getEditorial());
            AuthorDto authorDTO = new AuthorDto();
            authorDTO.setName(bookI.getAuthor().getName());
            authorDTO.setLastName(bookI.getAuthor().getLastname());
            book.setAuthorDto(authorDTO);
            bookList.add(book);
        }
        return bookList;
    }
}
