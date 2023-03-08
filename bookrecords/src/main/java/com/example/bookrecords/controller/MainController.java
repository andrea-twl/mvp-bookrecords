package com.example.bookrecords.controller;

import com.example.bookrecords.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
public class MainController {

    private final MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @RequestMapping("/getTop3ReadBook")
    @GetMapping
    public ResponseEntity getTop3ReadBook(@RequestParam(value = "country_code", defaultValue = "SG") String countryCode) {
        return mainService.getTop3ReadBook(countryCode);
    }

    @RequestMapping("/getRandomCountry")
    @GetMapping
    public ResponseEntity getRandomCountry() {
        return mainService.getRandomCountry();
    }
}
