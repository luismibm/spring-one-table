package com.luismibm.springonetable.model.repository;

import com.luismibm.springonetable.model.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends CrudRepository<City, Long> { }