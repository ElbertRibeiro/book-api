package com.elbertribeiro.book

import org.springframework.stereotype.Service

@Service
class BookService(val repository: BookRepository) {
    fun save(title: String) : Book {
        return repository.save(Book(title))
    }
}