package com.example.bookrecords.model;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;

import java.io.Serializable;
import java.util.Objects;

@IdClass(BookRentsPkey.class)
public class BookRentsPkey implements Serializable {

    private Integer bookId;
    private Integer personId;

    public BookRentsPkey(Integer bookId, Integer authorId) {
        this.bookId = bookId;
        this.personId = authorId;
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
        return Objects.equals(this.bookId, authorBook.getBookId())
                && Objects.equals(this.personId, authorBook.getAuthorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookId, personId);
    }
}
