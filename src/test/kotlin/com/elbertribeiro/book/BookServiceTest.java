package com.elbertribeiro.book;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookServiceTest {

    BookRepository repository = mock(BookRepository.class);
    List<Book> books = mock(List.class);

    @Test
    void list() {
        when(repository.findAll()).thenReturn(books);
        assertNotNull(new BookService(repository).list());
    }

}