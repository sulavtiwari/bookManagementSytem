package com.bookMgmt.bookManagementSytem.services;

import com.bookMgmt.bookManagementSytem.Dao.BookDao;
import com.bookMgmt.bookManagementSytem.Exception.BookNotFoundException;
import com.bookMgmt.bookManagementSytem.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImplem implements BookService{

//    private List<Book> lists;
  @Autowired
  private BookDao bookDao;
    public BookServiceImplem() {
//        lists= new ArrayList<>();
//        lists.add(new Book(1,"Harry Potter","JK Rowling",400,2011));
//        lists.add(new Book(2,"To Kill a Mockingbird","Harper Lee",500,1960));
//        lists.add(new Book(3,"The Great Gatsby","Scott Fitzgerald",900,1925));
//        lists.add(new Book(4,"The Catcher in the Rye","J.D. Salinger",780,1951));
    }

    @Override
    public List<Book> getBooks() {

       return bookDao.findAll();
    }

    @Override
    public Book getBookById(int id) {
//        Book bookById = null;
//        for(Book book : lists){
//            if(book.getId()==id){
//                bookById = book;
//                break;
//            }
//        }
      Optional<Book> byId = bookDao.findById(id);
        if (byId.isEmpty()) {
          throw new BookNotFoundException("The book with id : " + id + "was not found");
        } else {
          return byId.get();
        }
    }

    @Override
    public Book addBook(Book book) {

        return bookDao.save(book);
    }

  @Override
  public Book updateBook(Book book) {
    return bookDao.save(book);
  }

  @Override
  public void deleteBook(int id) {
    Book entity = bookDao.getOne(id);
    bookDao.delete(entity);
  }
}
