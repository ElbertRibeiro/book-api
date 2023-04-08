package com.elbertribeiro.author;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @QueryMapping
    public Author saveAuthor(@Argument AuthorDto author) {
        return service.saveAuthor(author.name(), author.email());
    }
}
