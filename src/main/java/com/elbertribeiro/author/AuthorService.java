package com.elbertribeiro.author;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository repository;

    public AuthorService(AuthorRepository repository) {
        this.repository = repository;
    }

    public List<Author> list(){
        return repository.findAll().stream().toList();
    }

    public Author saveAuthor(String name, String email) {
        Author author = new Author();
        author.setName(name);
        author.setEmail(email);
        return repository.save(author);
    }
}
