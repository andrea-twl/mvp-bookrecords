package com.example.bookrecords.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
public class Books {
    @Id
    @SequenceGenerator(name = "books_id_seq", sequenceName = "books_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String name;
    private Timestamp createdAt;
    private Timestamp updatedAt;

    public Books(Integer id, String name, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Books(String name, Timestamp createdAt, Timestamp updatedAt) {
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Books(String name) {
        this.name = name;
    }

    public Books() {
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
