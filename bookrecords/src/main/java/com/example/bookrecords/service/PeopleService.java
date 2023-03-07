package com.example.bookrecords.service;

import com.example.bookrecords.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleService {
    private final PeopleRepository peopleRepository;

    @Autowired
    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<String> getTop3People(int countryId) {
        return this.peopleRepository.getTop3People(countryId);
    }
}
