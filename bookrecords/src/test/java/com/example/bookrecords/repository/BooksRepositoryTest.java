package com.example.bookrecords.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// @DataJpaTest
@SpringBootTest
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
        for (int i = 0; i < expected.size() && i < result.size(); i++) {
            List<Object> nestedResult = result.get(i);
            List<Object> nestedExpected = expected.get(i);
            for (int j = 0; j < nestedExpected.size() && j < nestedResult.size(); j++) {
                assertTrue(nestedExpected.get(j).equals(nestedResult.get(j)));
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

}