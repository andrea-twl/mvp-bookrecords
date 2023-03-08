package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class People {
    @Id
    @SequenceGenerator(name = "people_id_seq", sequenceName = "people_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private Long countryId;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public People(Integer id, String name, Long countryId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public People(String name, Long countryId, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.countryId = countryId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public People(String name, Long countryId) {
        this.name = name;
        this.countryId = countryId;
    }

    public People() {
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

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }
}
