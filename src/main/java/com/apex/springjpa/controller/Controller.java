package com.apex.springjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apex.springjpa.entity.Employee;
import com.apex.springjpa.service.$missing$;
import com.apex.springjpa.service.EmpService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/employee")
@RequiredArgsConstructor
public class Controller {
	
private final EmpService empService;	

private final EmpService empservice;

	
	public ResponseEntity<Employee> create(Employee emp)  {
		
		return ResponseEntity.ok(emp).save(empservice.create(emp));
		
		
		
		public ResponseEntity<List<Employee>> getall()
		{
			
			
		}
		
 

}
