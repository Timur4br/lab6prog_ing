package com.example.lab6_spring_prog_ing_2.controller;

import com.example.lab6_spring_prog_ing_2.entity.Users;
import com.example.lab6_spring_prog_ing_2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {
    @Autowired
    private UsersService usersService;
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String RegisterForm(Model model){
        model.addAttribute("users", new Users());
        return "register";
    }
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String Register(@ModelAttribute("user") Users users){
        users.setRole("users");
        usersService.addUsers(users);
        return "redirect:/users";
    }
}
