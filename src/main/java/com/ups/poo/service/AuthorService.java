package com.ups.poo.service;

import com.ups.poo.domain.Author;
import com.ups.poo.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    public List<Author> findAll() {
        List<Author> authorList = new ArrayList<>();
        Iterable<Author> authorIterable = authorRepository.findAll();
        for(Author author: authorIterable) {
            authorList.add(author);
        }
        return authorList;
    }
}
