package com.taskmate.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmate.Entity.GroupMember;

public interface GroupMemberRepository extends JpaRepository<GroupMember, Long> {
    List<GroupMember> findByUserId(Long userId);
    List<GroupMember> findByGroupId(Long groupId);
}