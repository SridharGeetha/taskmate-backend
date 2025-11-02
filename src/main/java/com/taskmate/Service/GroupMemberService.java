package com.taskmate.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmate.Entity.GroupMember;
import com.taskmate.Repository.GroupMemberRepository;
import com.taskmate.ServiceInterface.Services;

public class GroupMemberService implements Services<GroupMember> {

    @Autowired
    private GroupMemberRepository groupMemberRepository;

    @Override
    public GroupMember create(GroupMember data) {
       GroupMember groupMember = new GroupMember(data.getUserId(),data.getGroupId());
       return groupMemberRepository.save(groupMember);
    }

    @Override
    public GroupMember get(Long id) {
        return groupMemberRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        groupMemberRepository.deleteById(id);
    }

    @Override
    public GroupMember update(Long id, GroupMember user) {
        return new GroupMember();
    }
    
}
