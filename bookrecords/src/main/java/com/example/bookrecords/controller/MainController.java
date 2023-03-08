package com.example.bookrecords.controller;

import com.example.bookrecords.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/getTop3ReadBook")
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    public ResponseEntity getTop3ReadBook(@RequestParam("country_code") String countryCode) {
        return mainService.getTop3ReadBook(countryCode);
    }
}
