package com.elbertribeiro.book;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BookGraphQL /*implements GraphQLMutationResolver, GraphQLQueryResolver*/ {
    private final BookService bookService;

    public BookGraphQL(BookService bookService) {
        this.bookService = bookService;
    }

    public Optional<Book> findBook(String isbn) {
        return bookService.findBook(isbn);
    }

    public Book createBook(Book book, String email) {
        return bookService.create(book, email);
    }

}
