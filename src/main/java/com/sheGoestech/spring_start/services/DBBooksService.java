package com.sheGoestech.spring_start.services;

import com.sheGoestech.spring_start.exceptions.NotFoundException;
import com.sheGoestech.spring_start.model.Books;
import com.sheGoestech.spring_start.repository.BooksRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Service
public class DBBooksService implements BooksRecordService{
    private final BooksRepository booksRepository;

    @Override
    public Books register(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public List<Books> getAll() {
        return booksRepository.findAll();
    }

    @Override
    public Books getById(Long id) {
        return booksRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Book record does not exist"));
    }

    @Override
    public Books updateBooks(Long id, Books updateBooks) {
        Books existingBook = booksRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Book record does not exist"));
        existingBook.setBookName(updateBooks.getBookName());
        existingBook.setAuthor(updateBooks.getAuthor());
        existingBook.setGenre(updateBooks.getGenre());


        return booksRepository.save(existingBook);



    }



    @Override
    public void delete(Long id) {
        booksRepository.deleteById(id);

    }
}
