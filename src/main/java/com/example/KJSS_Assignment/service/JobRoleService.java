package com.example.KJSS_Assignment.service;

import com.example.KJSS_Assignment.model.JobRole;
import com.example.KJSS_Assignment.repo.IJobRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobRoleService {

    @Autowired
    IJobRole iJobRole;

    public String addJobRole(JobRole jobRole) {
        iJobRole.save(jobRole);
        return "Job Role Added SuccessFully";
    }

    public Optional<JobRole> getById(Long id) {
        return iJobRole.findById(id);
    }

    public String deleteById(Long id) {
        if(!iJobRole.findById(id).isPresent()){
            return "Id Not Found";
        }
        iJobRole.deleteById(id);
        return "JobRole With this Id Deleted Successfully";
    }

    public List<JobRole> getJobRole() {
        return iJobRole.findAll();
    }

    public List<JobRole> getByJobRole(String jobRole) {
        return iJobRole.findByRoleName(jobRole);
    }
}
