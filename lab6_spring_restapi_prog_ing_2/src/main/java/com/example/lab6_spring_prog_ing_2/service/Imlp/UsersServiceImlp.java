package com.example.lab6_spring_prog_ing_2.service.Imlp;


import com.example.lab6_spring_prog_ing_2.entity.Users;
import com.example.lab6_spring_prog_ing_2.repository.UsersRepository;
import com.example.lab6_spring_prog_ing_2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImlp implements UsersService {
    @Autowired
    UsersRepository usersRepository;
    @Override
    public Users findByUsersName(String userName) {
        return usersRepository.findByName(userName);
    }

    @Override
    public Users addUsers(Users user) {
        return usersRepository.save(user);
    }

    @Override
    public List<Users> findAllUsers() {
        return  usersRepository.findAll();
    }
}
