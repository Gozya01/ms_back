package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;


    public int addUser(User user) {
        return userMapper.insert(user);
    }

    public String query_Password_by_id(long id){
        return userMapper.query_password_by_id(id);
    }


}


