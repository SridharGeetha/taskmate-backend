package com.taskmate.ServiceImpl;

import com.taskmate.Entity.User;

public interface UserServiceImpl {

    public User createUser(User user);

    public User getUser(Long id);

    public void deleteUser(Long id);

    public User updateUser(Long id,User user);
    
}