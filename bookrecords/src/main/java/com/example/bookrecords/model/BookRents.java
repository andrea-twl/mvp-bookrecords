package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class BookRents {
    @EmbeddedId
    private BookRentsId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("person_id")
    private People people;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("book_id")
    private Books books;

    @Column(nullable = false)
    private ZonedDateTime updatedAt;

    public BookRents(BookRentsId id, People people, Books books, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.id = id;
        this.people = people;
        this.books = books;
        this.updatedAt = updatedAt;
    }

    public BookRentsId getId() {
        return id;
    }

    public void setId(BookRentsId id) {
        this.id = id;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
