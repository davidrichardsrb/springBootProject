package com.daveproject.carddatabase.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarRepository extends CrudRepository<Car,Long> {

    List<Car> findCarByBrandAndModel(String brand, String Model);

    List<Car> findCarByBrandOrColor(String brand,String Color);

}
