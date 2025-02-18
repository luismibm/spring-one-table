package com.luismibm.springonetable.model.entity;

import jakarta.persistence.*;

@Entity @Table(name = "COUNTRY")
public class Country {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long country_id;
    private String country_name;

    public Country() {}
    public Country(String name) {
        country_name = name;
    }

    public long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

}