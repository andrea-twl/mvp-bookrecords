package com.example.bookrecords.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DataJpaTest
class PeopleRepositoryTest {
    @Autowired
    private PeopleRepository repo;

    List<String> expected;

    private void setExpected(String... people) {
        expected = new ArrayList<>();
        for (String p : people) {
            expected.add(p);
        }
    }

    private void compareList(List<String> expected, List<String> result) {
        assertEquals(expected.size(), result.size(), "Overall size");
        for (int i = 0; i < expected.size() && i < result.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }

    @Test
    public void getTop3People_SampleData_ReturnCorrectList() {
        // When
        List<String> result = repo.getTop3People(1, 1);

        // Then
        setExpected("Alice Tan", "Bob Lee", "Charlie Phua");
        compareList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/emptyData.sql"})
    public void getTop3People_EmptyData_ReturnEmptyList() {
        // When
        List<String> result = repo.getTop3People(1, 1);

        // Then
        setExpected();
        compareList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/oneValidPerson.sql"})
    public void getTop3People_OneValidPerson_ReturnCorrectList() {
        // When
        List<String> result = repo.getTop3People(2, 1);

        // Then
        setExpected("Alice Tan");
        compareList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/peopleWithoutBooks.sql"})
    public void getTop3People_PeopleWithoutBooks_ReturnEmptyList() {
        // When
        List<String> result = repo.getTop3People(2, 1);

        // Then
        setExpected();
        compareList(expected, result);
    }
}
