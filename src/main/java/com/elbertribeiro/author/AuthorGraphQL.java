package com.elbertribeiro.author;

import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class AuthorGraphQL /*implements GraphQLMutationResolver, GraphQLQueryResolver*/ {

    private final AuthorService authorService;

    public AuthorGraphQL(AuthorService authorService) {
        this.authorService = authorService;
    }

    @SchemaMapping
    public Optional<Author> findAuthor(String email) {
        return authorService.findAuthorByEmail(email);
    }

    public Author createAuthor(Author author) {
        return authorService.create(author);
    }
}
