package com.kaanAcikgoz;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id",columnDefinition = "serial")
    private int id;

    @Column(name = "book_name",nullable = false)
    private String name;

    @Column(name = "book_publicationYear",nullable = false)
    private int publicationYear;

    @Column(name = "book_stock")
    private int stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_author_id", referencedColumnName = "author_id")
    private Author author;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "book_publisher_id", referencedColumnName = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book",cascade = CascadeType.ALL)
    private List<BookBorrowing> bookBorrowingList;

    @ManyToMany
    @JoinTable(
            name = "books2categories",
            joinColumns = {@JoinColumn(name = "books2categories_book_id")},
            inverseJoinColumns = {@JoinColumn(name = "books2categories_category_id")}
    )
    private List<Category> categoryList;

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
