package com.elbertribeiro

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class BookApi {
    @GetMapping("/")
    fun home(): String {
        return "Spring is here!"
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(BookApi::class.java, *args)
        }
    }
}