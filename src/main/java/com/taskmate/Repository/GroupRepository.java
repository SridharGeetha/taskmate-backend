package com.taskmate.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmate.Entity.Group;

public interface GroupRepository extends JpaRepository<Group, Long> {}
