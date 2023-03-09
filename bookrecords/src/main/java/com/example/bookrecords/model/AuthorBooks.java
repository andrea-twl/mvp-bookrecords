package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

// @Entity
@IdClass(AuthorBooksPkey.class)
public class AuthorBooks {
    @Id
    @Column(name = "author_id", nullable = false)
    private Integer authorId;

    @Id
    @Column(name = "book_id", nullable = false)
    private Integer bookId;

    @Column(nullable = false)
    private ZonedDateTime createdAt;

    @Column(nullable = false)
    private ZonedDateTime updatedAt;

    public AuthorBooks(Integer authorId, Integer bookId, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.authorId = authorId;
        this.bookId = bookId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AuthorBooks(Integer bookId, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.bookId = bookId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AuthorBooks(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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
