package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class AuthorBooks {
    @EmbeddedId
    private AuthorBooksId id;
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("authorId")
    private Authors authors;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("bookId")
    private Books books;

    @Column(nullable = false)
    private ZonedDateTime createdAt;

    @Column(nullable = false)
    private ZonedDateTime updatedAt;

    public AuthorBooks(AuthorBooksId id, Authors authors, Books books, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.id = id;
        this.authors = authors;
        this.books = books;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AuthorBooksId getId() {
        return id;
    }

    public void setId(AuthorBooksId id) {
        this.id = id;
    }

    public Authors getAuthors() {
        return authors;
    }

    public void setAuthors(Authors authors) {
        this.authors = authors;
    }

    public Books getBooks() {
        return books;
    }

    public void setBooks(Books books) {
        this.books = books;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
