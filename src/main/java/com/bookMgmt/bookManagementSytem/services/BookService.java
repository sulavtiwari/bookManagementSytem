package com.bookMgmt.bookManagementSytem.services;

import com.bookMgmt.bookManagementSytem.entities.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book getBookById(int id);
    public Book addBook(Book book);
    public Book updateBook(Book book);
    public void deleteBook(int id);
}
