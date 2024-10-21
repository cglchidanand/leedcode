package com.apex.springjpa.entity;

import java.util.List;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Department {

    @Id
    private  long id;


    private  String name;
    @OneToMany(mappedBy = "department_id")
    private  List<Employee> emp;
}

