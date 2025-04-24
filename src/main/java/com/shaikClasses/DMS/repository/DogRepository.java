package com.shaikClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.shaikClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {

}
