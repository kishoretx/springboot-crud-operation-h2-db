package com.javatpoint.model;

import javax.persistence.*;

//mark class as an Entity
@Entity
//defining class name as Table name
@Table
public class Books {
    //Defining book id as primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use IDENTITY for auto-incremented columns
    @Column
    private int bookId;
    @Column
    private String bookName;
    @Column
    private String author;
    @Column
    private int price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
