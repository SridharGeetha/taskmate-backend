package com.taskmate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmate.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {}
