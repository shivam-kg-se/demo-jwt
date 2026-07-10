package com.jwt.controlleres;


import com.jwt.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private IUserService userService;


    @GetMapping("/user")
    public String getAllUser(){
        System.out.println("Fetching all users");

        return "Welcome to the home page! and  it access using your jwt ";
    }
    public String getLoggedInUser(Principal principal){
        return  principal.getName();
    }

}
