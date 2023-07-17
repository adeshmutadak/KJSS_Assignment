package com.example.KJSS_Assignment.repo;

import com.example.KJSS_Assignment.controller.JobRoleController;
import com.example.KJSS_Assignment.model.JobRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IJobRole extends JpaRepository<JobRole, Long> {
    List<JobRole>findByRoleName(String jobRole);
}
