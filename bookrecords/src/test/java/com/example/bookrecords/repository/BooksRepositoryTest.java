package com.example.bookrecords.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.jdbc.Sql;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
// @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@DataJpaTest
//@SpringBootTest
class BooksRepositoryTest {
    @Autowired
    private BooksRepository repo;

    List<List<Object>> expected;

    private List<Object> getObjLs(String bName, int bId, String aName) {
        ArrayList bookDetails = new ArrayList<Object>();
        bookDetails.add(bName);
        bookDetails.add(bId);
        bookDetails.add(aName);
        return bookDetails;
    }

    private void setExpected(List<Object>... objLists) {
        expected = new ArrayList<>();
        for (List ls : objLists) {
            expected.add(ls);
        }
    }

    private void compareNestedList(List<List<Object>> expected, List<List<Object>> result) {
        assertEquals(expected.size(), result.size(), "Overall size");
        for (int i = 0; i < expected.size() && i < result.size(); i++) {
            List<Object> nestedResult = result.get(i);
            List<Object> nestedExpected = expected.get(i);
            assertEquals(nestedExpected.size(), nestedResult.size(), String.format("Nested list %s size", i));
            for (int j = 0; j < nestedExpected.size() && j < nestedResult.size(); j++) {
                Object expectedObj = nestedExpected.get(j);
                Object resultObj = nestedResult.get(j);
                if (expectedObj == null) {
                    assertTrue(resultObj == null, String.format("%s is null", j));
                } else {
                    assertTrue(expectedObj.equals(resultObj),
                            String.format("expected %s: %s, result %s: %s",
                                    j, expectedObj, j, resultObj));
                }

            }
        }
    }
    @Test
    public void getTop3ReadBook_SampleData_ReturnCorrectList() {
        // When
        List<List<Object>> result = repo.getTop3ReadBook();

        // Then
        setExpected(getObjLs("Guards! Guards!",3, "Terry Pratchet"),
                getObjLs("Mort",2, "Terry Pratchet"),
                getObjLs("Reaper Man",4, "Terry Pratchet"));

        compareNestedList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/emptyData.sql"})
    public void getTop3ReadBook_NoData_ReturnEmptyList() {
        // When
        List<List<Object>> result = repo.getTop3ReadBook();

        // Then
        setExpected();
        compareNestedList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/oneValidBook.sql"})
    public void getTop3ReadBook_OneValidBook_ReturnCorrectList() {
        // When
        List<List<Object>> result = repo.getTop3ReadBook();

        // Then
        setExpected(getObjLs("Good Omens",1, "Neil Gaiman"));
        compareNestedList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/twoValidBooks.sql"})
    public void getTop3ReadBook_TwoValidBook_ReturnCorrectList() {
        // When
        List<List<Object>> result = repo.getTop3ReadBook();

        // Then
        setExpected(getObjLs("Good Omens",1, "Neil Gaiman"),
                getObjLs("Reaper Man",2, "Terry Pratchet"));
        compareNestedList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/booksWithoutBorrowers.sql"})
    public void getTop3ReadBook_ValidBooksWithoutBorrowers_ReturnEmptyList() {
        // When
        List<List<Object>> result = repo.getTop3ReadBook();

        // Then
        setExpected();
        compareNestedList(expected, result);
    }

    @Test
    @Sql(scripts={"classpath:test_data/booksWithoutAuthor.sql"})
    public void getTop3ReadBook_BookWithoutAuthor_ReturnListWithoutAuthor() {
        // When
        List<List<Object>> result = repo.getTop3ReadBook();

        // Then
        setExpected(getObjLs("Good Omens",1, null),
                getObjLs("Reaper Man",2, null));
        compareNestedList(expected, result);
    }
}
