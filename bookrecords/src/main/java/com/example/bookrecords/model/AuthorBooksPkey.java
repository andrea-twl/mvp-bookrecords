package com.example.bookrecords.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class AuthorBooksPkey implements Serializable {

    private Integer authorId;
    private Integer bookId;

    public AuthorBooksPkey(Integer authorId, Integer bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        AuthorBooks authorBook = (AuthorBooks) o;
        return Objects.equals(this.authorId, authorBook.getAuthorId())
                && Objects.equals(this.bookId, authorBook.getBookId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, bookId);
    }
}
