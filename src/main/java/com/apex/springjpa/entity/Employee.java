package com.apex.springjpa.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    private  long id;
    private  String name;
@ManyToOne
@JoinColumn(name="department_id")
private Department depertment;

@ManyToMany(mappedBy ="contributors" ,cascade=cascadeType.ALL)
private List<Project> project;

}
