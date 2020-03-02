package com.learning.springboot.controller;
import com.learning.springboot.domain.Employee;
import com.learning.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //@GetMapping("/employee")
    @RequestMapping(value = "/employeeList",method = RequestMethod.GET)
    private List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();
    }

    @RequestMapping(value = "/employeeString",method = RequestMethod.GET,produces = { "application/json", "application/xml" })
    private String getAllEmployee() {
        return employeeService.getAllEmployee();
    }

    //@GetMapping("/employee/{id}")
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET,
            produces = { "application/json", "application/xml" })
    private Employee getPerson(@PathVariable("id") int id) {
        return employeeService.getEmployeeById(id);
    }

    //@DeleteMapping("/employee/{id}")
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    private void deletePerson(@PathVariable("id") int id) {
        employeeService.delete(id);
    }

    //@PostMapping("/employee")
    @RequestMapping(value = "/employee", method = RequestMethod.POST,
            consumes = { "application/json", "application/xml" })
    private int savePerson(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
        return employee.getEmp_id();
    }
    @RequestMapping(value = "/employee", method = RequestMethod.PUT,
            consumes = { "application/json", "application/xml" })
    private int savePersonUsingPut(@RequestBody Employee employee) {
        employeeService.saveOrUpdate(employee);
        return employee.getEmp_id();
    }
}
