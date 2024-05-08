package com.example.lab6_spring_prog_ing_2.service;

import com.example.lab6_spring_prog_ing_2.entity.Users;

import java.util.List;

public interface UsersService {
    Users findByUsersName(String usersName);
    Users addUsers(Users users);
    List<Users> findAllUsers();
}
