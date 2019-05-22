package com.learning.springboot.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;
    public List<Employee> getAllEmployee() {
        List<Employee> employees = new ArrayList<Employee>();
        employeeDao.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    public Employee getEmployeeById(int id) {
        return employeeDao.findById(id).get();
    }

    public void saveOrUpdate(Employee employee) {
        employeeDao.save(employee);
    }

    public void delete(int id) {
        employeeDao.deleteById(id);
    }
}

