package com.example.demo;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int insert(User user);
    String query_password_by_id(long id);
}

