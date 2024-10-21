package com.apex.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apex.springjpa.entity.Department;
@Repository

public interface DepartRepo extends JpaRepository<Long,Department> {

}
