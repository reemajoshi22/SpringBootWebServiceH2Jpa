package com.learning.springboot.service;

import com.learning.springboot.dao.UserDao;
import com.learning.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername username="+username);
        Iterable<User> user1=userDao.findAll();
        ArrayList arrayList=new ArrayList();

        Iterator<User> iterator = user1.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            String userName=user.getUserName();
            arrayList.add(userName);
        }
        System.out.println("username list "+arrayList);
        return null;
    }
}
