package com.example.bookrecords.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BookRentsId implements Serializable {

    private Integer personId;

    private Integer bookId;

    public BookRentsId(Integer personId, Integer bookId) {
        this.personId = personId;
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
        BookRentsId that = (BookRentsId) o;
        return Objects.equals(this.personId, that.personId)
                && Objects.equals(this.bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId, bookId);
    }
}
