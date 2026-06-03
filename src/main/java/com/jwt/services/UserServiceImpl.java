package com.jwt.services;

import com.jwt.models.User;
import com.jwt.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService, UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User register(User user) {
        String Id = UUID.randomUUID().toString();
        user.setUserId(Id);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return this.userRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("Loading user by username: " + username);
        User user = userRepo.findByName(username).orElseThrow(() -> new UsernameNotFoundException("User not found with name: " + username));
        System.out.println("User found: " + user.getName());
        System.out.println("Encoded password: " + user.getPassword());
        return org.springframework.security.core.userdetails
                .User
                .withUsername(user.getName())
                .password(user.getPassword())
                .authorities(new ArrayList<>())
                .build();
    }
}
