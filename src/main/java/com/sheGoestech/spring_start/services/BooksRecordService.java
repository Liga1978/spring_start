package com.sheGoestech.spring_start.services;

import com.sheGoestech.spring_start.model.Books;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public interface BooksRecordService {
    Books register(Books books);

    Collection <Books> getAll();

    Books getById(Long id);

    Books updateBooks(Long id, Books updateBooks);

    void delete(Long id);
}
