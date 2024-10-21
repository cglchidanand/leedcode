package com.apex.springjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.springjpa.entity.Employee;
import com.apex.springjpa.repository.EmpRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpService {
	
 	private final EmpRepo emprepo;

 	
 	private Employee create(Employee emp)  {
 		
 		return emprepo.save(emp);
		
	}
}
