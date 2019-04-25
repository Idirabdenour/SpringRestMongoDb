package com.javasampleapproach.springrest.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.springrest.mongodb.SpringBootAngular4MongoDbApplication;
import com.javasampleapproach.springrest.mongodb.model.Cities;
import com.javasampleapproach.springrest.mongodb.repo.CitiesRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CitiesController {

	@Autowired
	CitiesRepository repositoryCities;

	public List<Cities> getAllCities() {
		System.out.println("Get all Customers...");
		 
		List<Cities> allCities = repositoryCities.findAll();
		System.out.println(allCities.get(0).getId());
		return allCities;
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAngular4MongoDbApplication.class, args);
		try {
			CitiesController global = context.getBeanFactory().createBean(CitiesController.class);
            global.getAllCities();
        } finally {
            context.close();
        }
	}
}
