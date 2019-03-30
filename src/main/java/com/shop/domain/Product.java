package com.shop.domain;


import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    @ManyToOne
    private ProductCategory productCategory;
    private String size;
    private String comment;
    private String color;

}
