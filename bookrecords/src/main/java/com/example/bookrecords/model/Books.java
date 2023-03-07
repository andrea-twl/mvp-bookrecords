package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Books {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    // @Column(name = "createdAt")
    private LocalDate createdAt;
    // @Column(name = "updatedAt")
    private LocalDate updatedAt;

    public Books(Integer id, String name, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Books() {
    }

    public Books(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }
}
