package com.example.bookshop.Model;

import jakarta.persistence.*;
import java.util.HashSet;

import java.util.Set;

@Entity
@Table(name = "customer")
public class CustomerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany(targetEntity = BookModel.class)
    @JoinTable(name = "wantedBooks",
    joinColumns = @JoinColumn(name = "customer_id"),
    inverseJoinColumns = @JoinColumn(name = "book_id"))
    private Set<BookModel> wantedBooks = new HashSet<>();

    private String name;
    private String email;

    public CustomerModel(Set<BookModel> wantedBooks, String name, String email) {
        this.wantedBooks = wantedBooks;
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CustomerModel() {
    }

    public int getId() {
        return id;
    }

    public Set<BookModel> getWantedBooks() {
        return wantedBooks;
    }

    public void setWantedBooks(Set<BookModel> wantedBooks) {
        this.wantedBooks = wantedBooks;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
