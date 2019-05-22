package com.learning.springboot.dao;

import com.learning.springboot.domain.Employee;
import com.learning.springboot.domain.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {
    private EmployeeDao employeeDao;

    @Autowired
    public DataInit(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
        System.out.println("inside constructor of data init");
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = employeeDao.count();
        System.out.println("count " + count);
        if (count == 0) {
            Employee e1 = new Employee(1, 16, "reema", "joshi", "cse", 1.0f);
            Employee e2 = new Employee(2, 16, "riya", "joshi", "cse", 1.0f);
            employeeDao.save(e1);
            employeeDao.save(e2);

        }
    }
}
