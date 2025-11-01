package com.taskmate.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmate.Entity.User;
import com.taskmate.Repository.UserRepository;
import com.taskmate.ServiceImpl.UserServiceImpl;

public class UserService implements UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        User newUser = new User(user.getName(), user.getEmail());
        return userRepository.save(newUser);
    }

    @Override
    public User getUser(Long id) {
        if (id == null)
            return new User();
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public void deleteUser(Long id) {
        if (id == null) {
            System.out.println("Id is null");
            return;
        }
        userRepository.deleteById(id);
    }

    @Override
    public User updateUser(Long id,User user) {
        if (id == null)
            return new User();
        User updateUser =   userRepository.findById(id).orElseThrow();
        updateUser.setName(user.getName());
        updateUser.setEmail(user.getEmail());
        return userRepository.save(updateUser);
    }

}
