package com.example.KJSS_Assignment.controller;

import com.example.KJSS_Assignment.model.JobRole;
import com.example.KJSS_Assignment.service.JobRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/role")
public class JobRoleController {

    @Autowired
    JobRoleService jobRoleService ;

    @PostMapping
    public  String addJobRole(@RequestBody JobRole jobRole) {
        return jobRoleService.addJobRole(jobRole);
    }

    @GetMapping("/getRoleById/{id}")
    public Optional<JobRole> getById(@PathVariable Long id) {
        return jobRoleService.getById(id);
    }

    @DeleteMapping("Deleted By Id/ {id}")
    public String deleteById(@PathVariable Long id) {
        return jobRoleService.deleteById(id);
    }

    @GetMapping
    public List<JobRole>getJobRole(){
        return jobRoleService.getJobRole();
    }

    @GetMapping("getByJobRole/{JobRole}")
    public List<JobRole>getByJobRole(@PathVariable String JobRole) {
        return jobRoleService.getByJobRole(JobRole);
    }
}
