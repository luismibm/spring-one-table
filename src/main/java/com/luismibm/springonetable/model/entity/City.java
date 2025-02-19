package com.luismibm.springonetable.model.entity;

import jakarta.persistence.*;

@Entity @Table(name = "CITY")
public class City {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long city_id;
    private String city_name;
    private int city_population;

    @ManyToOne @JoinColumn(name = "province_id")
    private Province province;

    public City(){}
    public City(String name, int population) {
        city_name = name;
        city_population = population;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public int getCity_population() {
        return city_population;
    }

    public void setCity_population(int city_population) {
        this.city_population = city_population;
    }

}