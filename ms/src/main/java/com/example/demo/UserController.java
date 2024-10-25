package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/users")
    public CommonResult<?> addUser(@RequestBody User user) {
        int ret=userService.addUser(user);
        if(ret==0)return CommonResult.success(0);
        long k=user.getId();
        return CommonResult.success(k);
    }

    @PostMapping("/users_query")
    public CommonResult<?> query(@RequestBody User user) {
        String db_password=userService.query_Password_by_id(user.getId());
        if(db_password!=null&&db_password.equals(user.getPassword()))return CommonResult.success(true);
        else return CommonResult.success(false);
    }
}

