package com.elbertribeiro.book

import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val service: BookService) {

    @MutationMapping
    fun saveBook(@Argument book: BookDto): BookDto {
        return service.save(book.title).toBookDto()
    }
}