package com.elbertribeiro.author;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
interface AuthorRepository extends JpaRepository<Author, UUID> {
}
