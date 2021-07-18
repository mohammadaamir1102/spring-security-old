package com.security.service;

import com.security.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class userService {

    List<User> list = new ArrayList<>();

    public userService() {
        list.add(new User("Aamir khan", "abc", "khanaamir1102@gmail.com"));
        list.add(new User("Aaquib khan", "efg", "khanaaquib1102@gmail.com"));
        list.add(new User("Aasim khan", "xyz", "khanaasim1102@gmail.com"));
    }
    //get All user
    public List<User> getAllUser() {
        return this.list;
    }

    //get User By Name
    public User userGetByName(String userName) {
        return this.list.stream().filter(user -> user.getUserName().equals(userName)).findAny().orElse(null);
    }
    //add user
   public User addUser(User user){
        this.list.add(user);
        return user;
   }
}
