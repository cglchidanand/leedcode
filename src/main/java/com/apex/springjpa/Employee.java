package com.apex.springjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private  long id;
    private  String name;

    @o
    private Department depertment;


}
