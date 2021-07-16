package com.sheGoestech.spring_start.repository;

import com.sheGoestech.spring_start.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    Optional<Books> findByBookName(String bookName);

    Optional<Books> findByBookNameAndAuthor(String bookName, String author);


    Long countAllByBookName(String BookName);


}