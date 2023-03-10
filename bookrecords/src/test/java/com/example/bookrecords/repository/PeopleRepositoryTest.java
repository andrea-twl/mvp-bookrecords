package com.example.bookrecords.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

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
    public void getTop3ReadBook_SampleData_ReturnCorrectList() {
        // When
        List<String> result = repo.getTop3People(1, 1);

        // Then
        setExpected("Alice Tan", "Bob Lee", "Charlie Phua");

        compareList(expected, result);
    }
}
