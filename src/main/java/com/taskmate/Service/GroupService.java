package com.taskmate.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;

import com.taskmate.Entity.Group;
import com.taskmate.Repository.GroupRepository;
import com.taskmate.ServiceInterface.Services;

public class GroupService implements Services<Group> {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group create(Group data) {
        Group group = new Group(data.getName(), data.getCreatedBy(), LocalDateTime.now());
        return groupRepository.save(group);
    }

     @Override
    public Group get(Long id) {
        if(id == null) return new Group();
        return groupRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(Long id) {
        if(id == null) return;
        groupRepository.deleteById(id);
    }


    @Override
    public Group update(Long id, Group data) {
        if(id == null) return new Group();
        Group group = groupRepository.findById(id).orElseThrow();
        group.setName(data.getName());
        group.setCreatedBy(data.getCreatedBy());
        return groupRepository.save(group);
    }
    
}
