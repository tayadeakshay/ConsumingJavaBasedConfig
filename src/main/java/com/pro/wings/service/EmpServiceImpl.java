package com.pro.wings.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pro.wings.model.Employee;

public class EmpServiceImpl implements EmpService {

	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	Environment environment;
	
	@Override
	public ResponseEntity<Employee> getEmployee(int id) {

		System.out.println("inside service class");
		
		String base_uri = environment.getProperty("api.baseuri");
		
		System.out.println(">>>>>>>>" + base_uri);
		
		String final_uri = base_uri.concat(Integer.toString(id));
		
		System.out.println(final_uri.toString());

		return restTemplate.getForEntity(final_uri.toString(), Employee.class);
	}

}
