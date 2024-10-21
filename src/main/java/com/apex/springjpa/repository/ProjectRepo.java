package com.apex.springjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.apex.springjpa.entity.Project;


@Repository
public interface ProjectRepo extends JpaRepository<Long, Project> {

}
