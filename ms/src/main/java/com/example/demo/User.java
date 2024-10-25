package com.example.demo;

import lombok.Data;

@Data
public class User {
    private long id;
    private String name;
    private String password;


    public User(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password=password;
    }

    public void setId(long id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }
    public String getPassword(){
        return password;
    }

    public long getId() {
        return id;
    }
}

