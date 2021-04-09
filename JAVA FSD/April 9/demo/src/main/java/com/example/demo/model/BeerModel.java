package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BeerModel {
    @Id
    private Integer brreId;
    private String beerName;
    private Integer  cost;
    public BeerModel() {
        super();
    }
    public BeerModel(Integer brreId, String beerName, Integer cost) {
        super();
        this.brreId = brreId;
        this.beerName = beerName;
        this.cost = cost;
    }
    public Integer getBrreId() {
        return brreId;
    }
    public void setBrreId(Integer brreId) {
        this.brreId = brreId;
    }
    public String getBeerName() {
        return beerName;
    }
    public void setBeerName(String beerName) {
        this.beerName = beerName;
    }
    public Integer getCost() {
        return cost;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }



}