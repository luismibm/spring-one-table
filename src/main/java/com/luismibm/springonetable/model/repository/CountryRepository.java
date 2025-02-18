package com.luismibm.springonetable.model.repository;

import com.luismibm.springonetable.model.entity.Country;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> { }