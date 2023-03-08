package com.example.bookrecords.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.ZonedDateTime;

@Entity
public class BookRents {
    @Id
    @Column(nullable = false)
    private Integer personId;
    @Id
    @Column(nullable = false)
    private Integer bookId;

    @Column(nullable = false)
    private ZonedDateTime createdAt;

    @Column(nullable = false)
    private ZonedDateTime updatedAt;

    public BookRents(Integer personId, Integer bookId, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.personId = personId;
        this.bookId = bookId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BookRents(Integer bookId, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.bookId = bookId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public BookRents(Integer bookId) {
        this.bookId = bookId;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
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
