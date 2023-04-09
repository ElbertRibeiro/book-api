package com.elbertribeiro;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class BookApi {

    public static void main(String[] args) {
        SpringApplication.run(BookApi.class, args);
    }

    @GetMapping("/")
    String home() {
        return "Spring is here!";
    }
}