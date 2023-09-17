package com.bookMgmt.bookManagementSytem.controller;

import com.bookMgmt.bookManagementSytem.entities.Book;
import com.bookMgmt.bookManagementSytem.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

@Autowired
    private BookService bookService;

    @GetMapping("/home")
    public String home() {
        return "Hello get request response called";
    }


    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookService.getBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable String id){
        return this.bookService.getBookById(Integer.parseInt(id));
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){
       return this.bookService.updateBook(book);
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<HttpStatus> deleteBook(@PathVariable String id){
        try {
            bookService.deleteBook(Integer.parseInt(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
