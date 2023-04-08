package com.elbertribeiro.author;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @QueryMapping
    public List<Author> listAuthors(){
        return service.list();
    }

    @MutationMapping
    public Author saveAuthor(@Argument AuthorDto author) {
        return service.saveAuthor(author.name(), author.email());
    }
}
