package com.learning.springboot.controller;

import com.learning.springboot.dao.EmployeeDao;
import com.learning.springboot.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
   private EmployeeDao employeeDao;
    @ResponseBody
    @RequestMapping(value = "employee/{id}",method = RequestMethod.GET)
    public String index(){
        System.out.println("Inside MainController");
        Iterable<Employee> employees=employeeDao.findAll();

        StringBuilder stringBuilder=new StringBuilder();
        employees.forEach(e->stringBuilder.append(e.getEmp_first_name()+"<br>"));

        return stringBuilder.toString();
    }
}
