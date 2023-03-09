package com.example.bookrecords.repository;

import com.example.bookrecords.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {

    @Query(value = "SELECT b.name, b.id, a.name " +
            "FROM books b INNER JOIN author_books ab ON b.id = ab.book_id " +
            "INNER JOIN authors a ON ab.author_id = a.id " +
            "INNER JOIN " +
            "(SELECT b.id, COUNT(b) AS book_count " +
            "FROM books b INNER JOIN book_rents br ON b.id = br.book_id " +
            "INNER JOIN people p ON p.id = br.person_id " +
            "GROUP BY b.id) AS bc ON b.id = bc.id " +
            "ORDER BY bc.book_count DESC " +
            "LIMIT 3",
            nativeQuery=true
    )
    public List<List<Object>> getTop3ReadBook();

    @Query(value = "SELECT b.name, b.id, a.name " +
            "FROM books b INNER JOIN author_books ab ON b.id = ab.book_id " +
            "INNER JOIN authors a ON ab.author_id = a.id " +
            "INNER JOIN " +
            "(SELECT b.id, COUNT(b) AS book_count " +
            "FROM books b INNER JOIN book_rents br ON b.id = br.book_id " +
            "INNER JOIN people p ON p.id = br.person_id " +
            "WHERE p.country_id = :country " +
            "GROUP BY b.id) AS bc ON b.id = bc.id " +
            "ORDER BY bc.book_count DESC " +
            "LIMIT 3",
            nativeQuery=true
    )
    public List<List<Object>> getTop3ReadBookLocally(@Param("country") int countryId);

}
