package com.example.bookrecords.repository;

import com.example.bookrecords.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {
    @Query(value = "SELECT p.name " +
            "FROM books b INNER JOIN book_rents br ON b.id = br.book_id " +
                "INNER JOIN people p ON p.id = br.person_id " +
            "WHERE p.country_id = :country " +
            "GROUP BY p.id " +
            "ORDER BY COUNT(p) DESC " +
            "LIMIT 3",
            nativeQuery=true
    )
    public List<String> getTop3PeopleLocally(@Param("country") int countryId);

    @Query(value = "SELECT p.name " +
            "FROM books b INNER JOIN book_rents br ON b.id = br.book_id " +
            "INNER JOIN people p ON p.id = br.person_id " +
            "WHERE p.country_id = :country " +
            "GROUP BY p.id " +
            "ORDER BY COUNT(p) DESC " +
            "LIMIT 3",
            nativeQuery=true
    )
    public List<String> getTop3People(@Param("country") int countryId);

}
