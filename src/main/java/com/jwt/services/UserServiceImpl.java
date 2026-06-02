package com.jwt.services;

import com.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService{
    private List<User> store = new ArrayList<>();
    public UserServiceImpl() {
        store.add(new User(UUID.randomUUID().toString(),"shivam ","shivam123"));
        store.add(new User(UUID.randomUUID().toString(),"ayush","ayush123"));
        store.add(new User(UUID.randomUUID().toString(),"shivang","shivang123"));

        store.add(new User(UUID.randomUUID().toString(),"satyam","satyam123"));

    }

    @Override
    public List<User> getUsers() {
        return this.store;
    }
}
