package com.example.KJSS_Assignment.repo;

import com.example.KJSS_Assignment.controller.DepartmentController;
import com.example.KJSS_Assignment.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDepartment extends JpaRepository<Department,Long> {
}
