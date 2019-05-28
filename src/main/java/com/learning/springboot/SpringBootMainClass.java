package com.learning.springboot;

import com.learning.springboot.dao.UserDao;
import com.learning.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EntityScan( basePackages = {"com.learning.springboot.main.domain"} )
//@Import({ Employee.class })

public class SpringBootMainClass implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMainClass.class,args);
    }

   private final UserDao userDao;

    public SpringBootMainClass(UserDao userDao) {
        this.userDao = userDao;

    }
    @Override
    public void run(String[] args) throws Exception {
        System.out.println("Initially User count in DB: {}"+userDao.count());
        User user1 = new User(1, "reema", "reema");
        User user2 = new User(2,"riya", "riya");
        User user3 = new User(3, "ronit", "ronit");
        System.out.println("Inserting data in DB");
        userDao.save(user1);
        userDao.save(user2);
        userDao.save(user3);
        System.out.println("After save User count in DB: {}"+userDao.count());
    }
}

