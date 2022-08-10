package com.pro.wings.service;

import org.springframework.http.ResponseEntity;

import com.pro.wings.model.Employee;

public interface EmpService {

	public ResponseEntity<Employee> getEmployee(int id);
}
