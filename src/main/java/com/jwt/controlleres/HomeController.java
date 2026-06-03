package com.jwt.controlleres;


import com.jwt.models.User;
import com.jwt.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

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
