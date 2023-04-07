package com.elbertribeiro.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface AuthorRepository extends JpaRepository<Author, Long> {
    Optional<Author> findByEmail(String email);

}
