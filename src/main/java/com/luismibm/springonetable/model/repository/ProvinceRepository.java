package com.luismibm.springonetable.model.repository;

import com.luismibm.springonetable.model.entity.Province;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceRepository extends CrudRepository<Province, Long> { }