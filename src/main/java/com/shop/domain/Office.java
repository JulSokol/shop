package com.shop.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "office")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    private String counyry;
    private String eMail;
    @OneToMany
    @JoinColumn(name = "office_id")
    private Set<Order> orders = new HashSet<>();
    private String password;

    public Office(String firstName, String lastName, String city, String counyry, String eMail, Set<Order> orders, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.counyry = counyry;
        this.eMail = eMail;
        this.orders = orders;
        this.password = password;
    }

    public Office() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounyry() {
        return counyry;
    }

    public void setCounyry(String counyry) {
        this.counyry = counyry;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Office{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", counyry='" + counyry + '\'' +
                ", eMail='" + eMail + '\'' +
                ", orders=" + orders +
                ", password='" + password + '\'' +
                '}';
    }
}
