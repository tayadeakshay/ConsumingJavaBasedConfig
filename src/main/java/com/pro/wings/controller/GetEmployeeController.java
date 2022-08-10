package com.pro.wings.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pro.wings.model.Employee;
import com.pro.wings.service.ConsumeEmployee;

@RestController
public class GetEmployeeController {

	@Autowired
	ConsumeEmployee empService;
	
	@GetMapping("/employee/{id}")
	public ResponseEntity<?> fetchEmployee(@PathVariable int id)
	{
	
		ResponseEntity<Employee> emp = empService.getForEntity(id);
		
		return ResponseEntity.ok().body(emp);
			
	}
}
