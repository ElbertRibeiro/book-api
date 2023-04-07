package com.elbertribeiro.author;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public Author create(Author author) {
        return repository.save(author);
    }

    public Optional<Author> findAuthorByEmail(String email) {
        return repository.findByEmail(email);
    }
}
