package com.bookMgmt.bookManagementSytem.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {

    @Id
    private int id;
    private String title;
    private String author;
    private double price;
    private int yearPublished;

//    public Book(int id,String title, String author, double price, int yearPublished) {
//        this.id=id;
//        this.title = title;
//        this.author = author;
//        this.price = price;
//        this.yearPublished = yearPublished;
//    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYearPublished() {
        return yearPublished;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", yearPublished=" + yearPublished +
                '}';
    }
}


