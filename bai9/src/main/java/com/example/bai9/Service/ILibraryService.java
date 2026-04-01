package com.example.bai9.Service;

import com.example.bai9.entity.Book;


import java.util.List;

public interface ILibraryService {
    List<Book> findAll();
    Book findBookById(Long id);
    String borrowBook(Long bookId);
    void returnBook(String code);
}
