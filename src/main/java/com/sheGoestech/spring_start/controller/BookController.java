package com.sheGoestech.spring_start.controller;
import com.sheGoestech.spring_start.model.Books;
import com.sheGoestech.spring_start.services.BookRecordService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/books",produces = APPLICATION_JSON_VALUE)
public class BookController {
    private final BookRecordService bookRecordService;

    public BookController(BookRecordService bookRecordService) {
        this.bookRecordService = bookRecordService;
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public Books create (@RequestBody Books books){
        return bookRecordService.register(books);
    }
    @GetMapping
    public Collection<Books> getAll(){
        return bookRecordService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Books> getById(@PathVariable("id")Long id){
        return bookRecordService.getById(id);
    }

    @PutMapping(value = "/{id}", consumes = APPLICATION_JSON_VALUE)
    public Books updateBooks(@PathVariable("id")Long id,
                             @RequestBody Books books){
        return bookRecordService.updateBooks(id,books);
    }

    @DeleteMapping(value = "{id}")
    public String updateBooks(@PathVariable("id")Long id){
        bookRecordService.delete(id);
        return "Book deleted";
    }
}
