package com.elbertribeiro.book

import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class BookController {
    @QueryMapping
    fun hello(): String {
        return "ola"
    }
}