package com.luismibm.springonetable.controller;

import com.luismibm.springonetable.model.entity.City;
import com.luismibm.springonetable.model.entity.Country;
import com.luismibm.springonetable.model.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/countries")
public class CountryRestController {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping
    public List<Country> getCountries() {
        return (List<Country>) countryRepository.findAll();
    }

}