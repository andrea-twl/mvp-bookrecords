package com.example.bookrecords.config;

import com.example.bookrecords.repository.BooksRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class BooksConfig {

    //@Bean
    CommandLineRunner commandLineRunner(BooksRepository repo) {
        return args -> {

        };
    }
}
