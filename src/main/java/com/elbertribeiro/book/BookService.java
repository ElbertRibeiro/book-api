package com.elbertribeiro.book;

import com.elbertribeiro.author.AuthorService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    private final BookRepository repository;
    private final AuthorService authorService;

    public BookService(BookRepository repository, AuthorService authorService) {
        this.repository = repository;
        this.authorService = authorService;
    }


    public Book create(Book book, String email) {
        book.setAuthor(authorService.findAuthorByEmail(email).orElse(null));
        return repository.save(book);
    }

    public Optional<Book> findBook(String isbn) {
        return repository.findByIsbn(isbn);
    }
}
