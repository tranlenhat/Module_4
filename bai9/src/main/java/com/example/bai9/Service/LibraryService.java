package com.example.bai9.Service;

import com.example.bai9.Repository.IBookRepository;
import com.example.bai9.Repository.IBorrowRepository;
import com.example.bai9.entity.Book;
import com.example.bai9.entity.Borrow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService implements ILibraryService {

    @Autowired
    IBookRepository bookRepository;

    @Autowired
    IBorrowRepository borrowRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public String borrowBook(Long id) {
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) {
            throw new RuntimeException("Không tìm thấy sách");
        }
        if (book.getQuantity() == 0) {
            throw new RuntimeException("Hết sách");
        }

        book.setQuantity(book.getQuantity() - 1);
        bookRepository.save(book);
        String code = String.valueOf((int)(Math.random() * 90000) + 10000);
        Borrow borrow = new Borrow();
        borrow.setBorrowCode(code);
        borrow.setBook(book);

        borrowRepository.save(borrow);

        return code;
    }

    @Override
    public void returnBook(String code) {
        Borrow borrow = borrowRepository.findByBorrowCode(code).orElse(null);

        if (borrow == null) {
            throw new RuntimeException("Mã sai");
        }

        Book book = borrow.getBook();
        book.setQuantity(book.getQuantity() + 1);
        bookRepository.save(book);
        borrowRepository.delete(borrow);
    }
    @Override
    public Book findBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }
}