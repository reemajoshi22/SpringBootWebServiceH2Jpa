package com.learning.springboot.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "EMPLOYEE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @Column(name = "ID",nullable =false)
    @GeneratedValue
    int emp_id;

    @Column(name = "AGE")
    int emp_age;

    @Column(name = "FIRST_NAME")
    String emp_first_name;

    @Column(name = "LAST_NAME")
    String emp_last_name;

    @Column(name = "DEPARTMENT")
    String employee_dept;

    @Column(name = "SALARY")
    Float employee_salary;
}
