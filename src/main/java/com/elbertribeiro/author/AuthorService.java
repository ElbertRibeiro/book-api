package com.elbertribeiro.author;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public Author saveAuthor(String name, String email) {
        Author author = new Author();
        author.setName(name);
        author.setEmail(email);
        return repository.save(author);
    }
}
