package com.jwt.services;

import com.jwt.models.User;
import com.jwt.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserRepo userRepo;

    @Override
    public User register(User user) {
        String Id = UUID.randomUUID().toString();
        user.setUserId(Id);
        return this.userRepo.save(user);
    }


//    @Override
//    public User saveUser(User user) {
//
//            String userId = UUID.randomUUID().toString();
//            user.setUserId(userId);
//        return this.userRepo.save(user);
//    }

//    @Override
//    public List<User> getAllUsers() {
//        return this.userRepo.findAll();
//    }


//    @Override
//    public List<User> getUsers() {
//        return List.of();
//    }


//    private List<User> store = new ArrayList<>();
//    public UserServiceImpl() {
//        store.add(new User(UUID.randomUUID().toString(),"shivam ","shivam123"));
//        store.add(new User(UUID.randomUUID().toString(),"ayush","ayush123"));
//        store.add(new User(UUID.randomUUID().toString(),"shivang","shivang123"));
//
//        store.add(new User(UUID.randomUUID().toString(),"satyam","satyam123"));
//
//    }

//    @Override
//    public List<User> getUsers() {
//        return this.store;
//    }
}
