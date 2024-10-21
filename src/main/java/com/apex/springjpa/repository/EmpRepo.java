package com.apex.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apex.springjpa.entity.Employee;
@Repository

public interface EmpRepo extends JpaRepository<Long, Employee> {

}
