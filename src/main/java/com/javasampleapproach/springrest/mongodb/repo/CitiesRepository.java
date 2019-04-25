package com.javasampleapproach.springrest.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javasampleapproach.springrest.mongodb.model.Cities;

public interface CitiesRepository extends MongoRepository<Cities, String> {
}
