package com.sheGoestech.spring_start.services;

import com.sheGoestech.spring_start.model.Books;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
public class BookRecordService {
    private static final Map<Long, Books> BOOKS_MAP = new HashMap<>();
    private static final Long[] LAST_ID = new Long[]{0L};

    public Books register(Books books){
        Long newID = LAST_ID[0]+1;
        books.setId(newID);

        BOOKS_MAP.put(books.getId(), books);
        LAST_ID[0] = newID;

        return books;

    }

    public Collection<Books> getAll(){
        return BOOKS_MAP.values();
    }
    public Optional<Books> getById(Long id) {
        return Optional.ofNullable(BOOKS_MAP.get(id));
    }

    public Books updateBooks (Long id, Books updateBooks){
        Books booksRecord = BOOKS_MAP.get(id);
        if (booksRecord == null)
                return null;

        booksRecord.setBookName(updateBooks.getBookName());
        booksRecord.setAuthor(updateBooks.getAuthor());
        booksRecord.setGenre(updateBooks.getGenre());

        BOOKS_MAP.put(id, booksRecord);
        return booksRecord;
    }

    public void delete(Long id){
        BOOKS_MAP.remove(id);
    }
}
