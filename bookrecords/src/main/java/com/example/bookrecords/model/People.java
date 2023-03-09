package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.time.ZonedDateTime;

@Entity
public class People {
    @Id
    @SequenceGenerator(name = "people_id_seq", sequenceName = "people_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "people_id_seq")
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Long countryId;

    @Column(nullable = false)
    private ZonedDateTime createdAt;

    @Column(nullable = false)
    private ZonedDateTime updatedAt;

    public People(Integer id, String name, Long countryId, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.countryId = countryId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public People(String name, Long countryId, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
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

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
