package com.elbertribeiro.author;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AuthorController {
    private final AuthorService service;

    public AuthorController(AuthorService service) {
        this.service = service;
    }

    @QueryMapping
    public List<AuthorDto> listAuthors() {
        return service.list()
                .stream()
                .map(author -> new AuthorDto(author.getName(), author.getEmail()))
                .toList();
    }

    @MutationMapping
    public AuthorDto saveAuthor(@Argument AuthorDto author) {
        return Optional.ofNullable(service.save(author.name(), author.email()))
                .map(author1 -> new AuthorDto(author1.getName(), author1.getEmail()))
                .orElseThrow();
    }
}
