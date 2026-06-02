package com.jwt.controlleres;


import com.jwt.models.User;
import com.jwt.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IUserService userService;


    @GetMapping("/user")
    public List<User> getUser(){

        return this.userService.getUsers();
    }
    public String getLoggedInUser(Principal principal){
        return  principal.getName();
    }
}
