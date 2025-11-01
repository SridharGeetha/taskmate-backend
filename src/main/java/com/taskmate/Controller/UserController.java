package com.taskmate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmate.Entity.User;
import com.taskmate.Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public User createUser(User user){
       return userService.createUser(user);
    }

    @PutMapping("/{id}")
    public User updatUser(@PathVariable("id") Long id,User user){
        return userService.updateUser(id, user);
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }
    
}
