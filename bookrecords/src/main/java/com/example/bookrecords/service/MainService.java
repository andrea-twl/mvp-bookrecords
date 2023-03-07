package com.example.bookrecords.service;

import com.example.bookrecords.repository.BooksRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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
            default:
                // should not happen
                countryId = 0;
        }
        ArrayList<ObjectNode> nodeList = new ArrayList<>(3);
        List<List<String>> topBooks = booksService.getTop3ReadBook(countryId);
        List<String> topBorrowers = peopleService.getTop3People(countryId);

        for (List<String> book : topBooks) {
            ObjectNode objectNode = mapper.createObjectNode();
            objectNode.put("name", book.get(0));
            objectNode.put("author", book.get(1));
            ArrayNode borrowers = mapper.valueToTree(topBorrowers);
            objectNode.putArray("borrower").addAll(borrowers);
            nodeList.add(objectNode);
        }
        return  ResponseEntity.ok(nodeList);
    }
}
