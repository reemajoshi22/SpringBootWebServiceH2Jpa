package com.learning.springboot.dao;

import com.learning.springboot.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User,Integer> {
   // User findByUsername(String username);
}
