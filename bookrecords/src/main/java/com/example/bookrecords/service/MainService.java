package com.example.bookrecords.service;

import com.example.bookrecords.repository.BooksRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class MainService {
    private final BooksService booksService;
    private final PeopleService peopleService;
    private final ObjectMapper mapper;

    @Autowired
    public MainService(BooksService booksService, PeopleService peopleService, ObjectMapper mapper) {
        this.booksService = booksService;
        this.peopleService = peopleService;
        this.mapper = mapper;
    }

    /**
     * Based on clarification of the assignment - finds the top 3 books read globally, then for each book
     * finds the top 3 people that rented that book the most in the same specified country
     * @param countryCode
     * @return response entity
     */
    public ResponseEntity getTop3ReadBook(String countryCode) {
        int countryId;
        switch (countryCode) {
            case "SG":
                countryId = 1;
                break;
            case "MY":
                countryId = 2;
                break;
            case "US":
                countryId = 3;
                break;
            default:
                ObjectNode objectNode = mapper.createObjectNode();
                objectNode.put("message", "invalid parameter");
                return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        }
        ArrayList<ObjectNode> nodeList = new ArrayList<>(3);
        List<List<Object>> topBooks = booksService.getTop3ReadBook();
        if (topBooks.isEmpty()) {
            ObjectNode objectNode = mapper.createObjectNode();
            objectNode.put("message", "no results");
            return new ResponseEntity<>(objectNode, HttpStatus.NOT_FOUND);
        }
        for (List<Object> book : topBooks) {
            ObjectNode objectNode = mapper.createObjectNode();
            List<String> topBorrowers = peopleService.getTop3People(countryId, (Integer) book.get(1));
            objectNode.put("name", (String) book.get(0));
            objectNode.put("author", (String) book.get(2));
            ArrayNode borrowers = mapper.valueToTree(topBorrowers);
            objectNode.putArray("borrower").addAll(borrowers);
            nodeList.add(objectNode);
        }
        return  ResponseEntity.ok(nodeList);
    }

    public ResponseEntity getRandomCountry() {
        String[] countryNames = new String[]{"Singapore", "Malaysia", "United States"};
        String[] countryCodes = new String[]{"SG", "MY", "US"};
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        ObjectNode outerNode = mapper.createObjectNode();
        ObjectNode innerNode = mapper.createObjectNode();
        innerNode.put("full_name", countryNames[randomNum]);
        innerNode.put("country_code", countryCodes[randomNum]);
        outerNode.put("country", innerNode);
        return ResponseEntity.ok(outerNode);
    }

    /**
     * Based on initial understanding of assignment - finds the top 3 books read for the specified country, then
     * for each book, finds the top 3 people that rented that book the most in the same specified country
     * @param countryCode
     * @return response entity
     */
    public ResponseEntity getTop3ReadBookLocally(String countryCode) {
        int countryId;
        switch (countryCode) {
            case "SG":
                countryId = 1;
                break;
            case "MY":
                countryId = 2;
                break;
            case "US":
                countryId = 3;
                break;
            default:
                ObjectNode objectNode = mapper.createObjectNode();
                objectNode.put("message", "invalid parameter");
                return new ResponseEntity<>(objectNode, HttpStatus.BAD_REQUEST);
        }
        ArrayList<ObjectNode> nodeList = new ArrayList<>(3);
        List<List<Object>> topBooks = booksService.getTop3ReadBookLocally(countryId);
        if (topBooks.isEmpty()) {
            ObjectNode objectNode = mapper.createObjectNode();
            objectNode.put("message", "no results");
            return new ResponseEntity<>(objectNode, HttpStatus.NOT_FOUND);
        }
        for (List<Object> book : topBooks) {
            ObjectNode objectNode = mapper.createObjectNode();
            List<String> topBorrowers = peopleService.getTop3People(countryId, (Integer) book.get(1));
            objectNode.put("name", (String) book.get(0));
            objectNode.put("author", (String) book.get(2));
            ArrayNode borrowers = mapper.valueToTree(topBorrowers);
            objectNode.putArray("borrower").addAll(borrowers);
            nodeList.add(objectNode);
        }
        return  ResponseEntity.ok(nodeList);
    }
}
