package com.pro.wings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pro.wings.model.Employee;

@Service
public class ConsumeEmployee {

	@Autowired
	Employee emp;
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String RESOURCE_PATH = "http://localhost:9494/IntegratedSpringAndHibernate/employee/";
	
	public ResponseEntity<Employee> getForEntity(int id) {
		ResponseEntity<Employee> entity = restTemplate.getForEntity(RESOURCE_PATH + id,
                Employee.class,
                id);
		
		return entity;
}
}