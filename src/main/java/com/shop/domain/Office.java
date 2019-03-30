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
    private Set<Order> orders = new HashSet<>();
    private String password;
}
