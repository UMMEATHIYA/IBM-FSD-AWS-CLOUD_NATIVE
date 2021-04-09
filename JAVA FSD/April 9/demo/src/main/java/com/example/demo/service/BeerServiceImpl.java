package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BeerDao;
import com.example.demo.model.BeerModel;
@Service
public class BeerServiceImpl implements BeerService{
    private BeerDao beerDao;


    @Autowired
    public BeerServiceImpl(BeerDao beerDao) {
        super();
        this.beerDao = beerDao;
    }


    @Override
    public List<BeerModel> getAllBeer() {
        // TODO Auto-generated method stub
        return beerDao.findAll();
    }

}