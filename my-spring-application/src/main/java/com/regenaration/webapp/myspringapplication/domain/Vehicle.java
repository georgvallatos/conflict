package com.regenaration.webapp.myspringapplication.domain;


import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity
@Table(name="vehicle")
public class Vehicle {


    @Id
    @Column(name="id")
    private Long id;


    @Column(name="plates")
    private String plates;

    @Column(name="brand")
    private String brand;

    @Column(name="color")
    private String color;

    @Column(name="contructionYear")
    private String constructionYear;


    @OneToOne(cascade =CascadeType.ALL,optional = false,mappedBy="vehicle",targetEntity = User.class)
    private User user;


    public Vehicle() {
    }


    public Vehicle(String plates, String brand, String color, String constructionYear) {
        this.plates = plates;
        this.brand = brand;
        this.color = color;
        this.constructionYear = constructionYear;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(String constructionYear) {
        this.constructionYear = constructionYear;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "plates='" + plates + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", constructionYear='" + constructionYear + '\'' +
                '}';
    }
}
