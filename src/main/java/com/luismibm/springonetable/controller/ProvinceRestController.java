package com.luismibm.springonetable.controller;

import com.luismibm.springonetable.model.entity.Province;
import com.luismibm.springonetable.model.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController @RequestMapping("/provinces")
public class ProvinceRestController {

    @Autowired
    ProvinceRepository provinceRepository;

    @GetMapping
    public List<Province> getProvinces() {
        return (List<Province>) provinceRepository.findAll();
    }

}