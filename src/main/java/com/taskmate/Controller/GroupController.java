package com.taskmate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmate.Entity.Group;
import com.taskmate.Service.GroupService;

@RestController
@RequestMapping("/group")
public class GroupController {

    @Autowired
    private GroupService groupService;

    @PostMapping
    public Group createGroup(Group data){
        return groupService.create(data);
    }

    @GetMapping("/{id}")
    public Group getGroup(@PathVariable("id") Long id){
        return groupService.get(id);
    }

    @PutMapping("/{id}")
    public Group updateGroup(@PathVariable("id") Long id,Group data){
        return groupService.update(id, data);
    }

    @DeleteMapping("/{id}")
    public void deleteGroup(@PathVariable("id") Long id){
        groupService.delete(id);
    }
}
