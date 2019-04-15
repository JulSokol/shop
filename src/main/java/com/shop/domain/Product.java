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

    public Product(String name, Double price, ProductCategory productCategory, String size, String comment, String color) {
        this.name = name;
        this.price = price;
        this.productCategory = productCategory;
        this.size = size;
        this.comment = comment;
        this.color = color;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", productCategory=" + productCategory +
                ", size='" + size + '\'' +
                ", comment='" + comment + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
