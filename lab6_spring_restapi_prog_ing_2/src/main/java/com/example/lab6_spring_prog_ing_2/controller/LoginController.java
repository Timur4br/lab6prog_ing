package com.example.lab6_spring_prog_ing_2.controller;

import com.example.lab6_spring_prog_ing_2.entity.Users;
import com.example.lab6_spring_prog_ing_2.entity.Client;
import com.example.lab6_spring_prog_ing_2.entity.Bus;
import com.example.lab6_spring_prog_ing_2.service.UsersService;
import com.example.lab6_spring_prog_ing_2.service.BusService;
import com.example.lab6_spring_prog_ing_2.service.ClientService;


import jakarta.servlet.http.HttpSession;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class LoginController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private BusService busService;
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String LoginForm(Model model){
        model.addAttribute("users", new Users());
        return "index";
    }
    @RequestMapping (value = "/login", method = RequestMethod.POST )
    public String Login(@ModelAttribute("users") Users users, HttpSession session){
        Users autUsers = usersService.findByUsersName(users.getName());
        if(autUsers != null && autUsers.getPassword().equals(users.getPassword())){
            session.setAttribute("users", autUsers);
            if(autUsers.getRole().equals("admin")){
                return "redirect:/admin";
            }else {
                return "redirect:/users";
            }
        }else {
            return "index";
        }
    }

    @RequestMapping("/users")
    public String users(Model model, HttpSession session){
        if(session.getAttribute("users") != null){
            List<Bus> bus =busService.findAllBus();
            model.addAttribute("bus", bus);
            return "users";
        }
        return "redirect:/";
    }

    @RequestMapping("/admin")
    public String admin(Model model, HttpSession session){
        if(session.getAttribute("users") != null){
            // List<User> users = userService.findAllUsers();
            List<Client> client = clientService.findAllClient();
            // model.addAttribute("users", users);
            model.addAttribute("client", client);
            return "admin";
        }
        return "redirect:/";
    }
}
