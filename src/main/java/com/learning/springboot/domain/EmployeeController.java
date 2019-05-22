package com.learning.springboot.domain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    private List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    @GetMapping("/employee/{id}")
    private Employee getPerson(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    private void deletePerson(@PathVariable("id") int id) {
        employeeService.delete(id);
    }

    @PostMapping("/employee")
    private int savePerson(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
        return employee.getEmp_id();
    }
}
