package com.elbertribeiro.book

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController(val service: BookService) {
    @QueryMapping
    fun hello(): String {
        return service.hello()
    }
}