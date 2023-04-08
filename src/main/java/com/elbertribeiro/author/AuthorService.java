package com.elbertribeiro.author;

import com.elbertribeiro.exception.ValidationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> list() {
        return Optional.of(repository.findAll()
                        .stream()
                        .toList())
                .filter(authors -> !authors.isEmpty())
                .orElseThrow(() -> new ValidationException("A lista está vazia."));
    }

    public Author save(String name, String email) {
        return Optional.of(repository.save(new Author(name, email))).orElseThrow();
    }

    public Author getAuthorByName(String name) {
        return repository.findAuthorByName(name);
    }
}
