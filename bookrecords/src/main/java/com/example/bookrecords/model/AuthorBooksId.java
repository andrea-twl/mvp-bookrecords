package com.example.bookrecords.model;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AuthorBooksId implements Serializable {

    // @Column(name = "person_id", nullable = false)
    private Integer authorId;

    // @Column(name = "book_id", nullable = false)
    private Integer bookId;

    public AuthorBooksId(Integer authorId, Integer bookId) {
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
        AuthorBooksId that = (AuthorBooksId) o;
        return Objects.equals(this.authorId, that.authorId)
                && Objects.equals(this.bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, bookId);
    }
}
