package com.elbertribeiro.author;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @QueryMapping
    public String hello() {
        return "Elbert";
    }
}
