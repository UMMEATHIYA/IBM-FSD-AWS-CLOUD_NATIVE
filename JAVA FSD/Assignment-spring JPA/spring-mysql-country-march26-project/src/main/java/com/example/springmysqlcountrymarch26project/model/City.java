package com.example.springmysqlcountrymarch26project.model;

import javax.persistence.*;

@Entity
@Table(name = "CITY")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "NAME")
    private String NAME;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "COUNTRY_ID")
    private Country country;

    public City() {

    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", NAME='" + NAME + '\'' +
                ", country=" + country +
                '}';
    }

    public City(String NAME) {
        this.NAME = NAME;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}