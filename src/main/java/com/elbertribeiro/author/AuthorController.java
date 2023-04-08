package com.elbertribeiro.author;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @QueryMapping
    public String hello(@Argument AuthorDto author) {
        return author.nome() + "  " + author.email();
    }
}
