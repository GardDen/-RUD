package com.kaydunov.kaydunov.com.Service;

import com.kaydunov.kaydunov.com.Entity.Book;

import java.util.List;

public interface BookService {
    List<Book> findAll();
    Book findById(Long id);
    Book save(Book book);
    void delete(Book book);
}