package com.taskmate.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmate.Entity.User;
import com.taskmate.Repository.UserRepository;
import com.taskmate.ServiceInterface.Services;

public class UserService implements Services<User> {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User create(User user) {
        User newUser = new User(user.getName(), user.getEmail());
        return userRepository.save(newUser);
    }

    @Override
    public User get(Long id) {
        if (id == null)
            return new User();
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            System.out.println("Id is null");
            return;
        }
        userRepository.deleteById(id);
    }

    @Override
    public User update(Long id,User user) {
        if (id == null)
            return new User();
        User updateUser =   userRepository.findById(id).orElseThrow();
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        return userRepository.save(updateUser);
    }

}
