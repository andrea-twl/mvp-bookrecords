package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@IdClass(AuthorBooksPkey.class)
public class AuthorBooks {
    @Id
    private Integer authorId;
    @Id
    private Integer bookId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public AuthorBooks(Integer authorId, Integer bookId, Timestamp createdAt, Timestamp updatedAt) {
        this.authorId = authorId;
        this.bookId = bookId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AuthorBooks(Integer bookId, Timestamp createdAt, Timestamp updatedAt) {
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

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
