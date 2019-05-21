package com.learning.springboot.dao;

import com.learning.springboot.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    public List<Employee> findByEmp_first_name(String name);
}
