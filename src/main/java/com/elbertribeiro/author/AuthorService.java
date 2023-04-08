package com.elbertribeiro.author;

import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    public String getNameAuthor(String name) {
        return name;
    }
}
