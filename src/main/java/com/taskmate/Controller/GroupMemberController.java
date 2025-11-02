package com.taskmate.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.taskmate.Entity.GroupMember;
import com.taskmate.Service.GroupMemberService;

@RestController
@RequestMapping("/groupmember")
public class GroupMemberController {
    
    @Autowired
    private GroupMemberService groupMemberService;

    @PostMapping
    public GroupMember createGroup(GroupMember data){
        return groupMemberService.create(data);
    }

    @GetMapping("/{id}")
    public GroupMember getGroupMember(@PathVariable("id") Long id){
        return groupMemberService.get(id);
    }

    public GroupMember updateGroupMember(@PathVariable("id") Long id,GroupMember groupMember){
        return groupMemberService.update(id, groupMember);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Long id){
        groupMemberService.delete(id);
    }
}
