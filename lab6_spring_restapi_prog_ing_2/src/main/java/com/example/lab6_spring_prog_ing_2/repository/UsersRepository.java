package com.example.lab6_spring_prog_ing_2.repository;

import com.example.lab6_spring_prog_ing_2.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository  extends JpaRepository<Users,Long> {
    Users findByName(String username);
}
