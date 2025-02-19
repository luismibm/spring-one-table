package com.luismibm.springonetable.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity @Table(name = "PROVINCE")
public class Province {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long province_id;
    private String province_name;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<City> cities;

    @ManyToOne @JoinColumn(name = "country_id")
    private Country country;

    public Province() {}
    public Province(long id, String name) {
        province_id = id;
        province_name = name;
    }

    public long getProvince_id() {
        return province_id;
    }

    public void setProvince_id(long province_id) {
        this.province_id = province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name;
    }

}