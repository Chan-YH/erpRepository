package com.yla.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.yla.entity.Brand;

public interface BrandRepository extends JpaRepository<Brand, Integer>,JpaSpecificationExecutor<Brand>{

}
