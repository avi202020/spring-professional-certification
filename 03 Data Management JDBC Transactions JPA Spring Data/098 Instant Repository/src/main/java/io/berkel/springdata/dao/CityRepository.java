package io.berkel.springdata.dao;

import org.springframework.data.repository.CrudRepository;

import io.berkel.springdata.model.City;

public interface CityRepository extends CrudRepository<City, Long> {

}
