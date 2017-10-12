package com.regenaration.webapp.myspringapplication.domain;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {


    @Id
    @Column(name="id")
    private Long id;

    @Column(name="afm")
    private String afm;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name ="email")
    private String email;

    @Column(name="address")
    private String address;

    @Column(name="pass")
    private String pass;

    @OneToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name="vehicle_id")
    private Vehicle vehicle;

    public User() {
    }

    public User(String afm, String firstName, String lastName, String email, String address, String pass) {
        this.afm = afm;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.pass = pass;
    }

    public String getAfm() {
        return afm;
    }

    public void setAfm(String afm) {
        this.afm = afm;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" +
                "afm='" + afm + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
