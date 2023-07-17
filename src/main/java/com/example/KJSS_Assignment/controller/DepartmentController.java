package com.example.KJSS_Assignment.controller;


import com.example.KJSS_Assignment.model.Application;
import com.example.KJSS_Assignment.model.Department;
import com.example.KJSS_Assignment.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/department")

public class DepartmentController {

  @Autowired
    DepartmentService departmentService;

  @PostMapping
    public String addDepa(@RequestBody Department department) {
      return departmentService.addDepa(department);
  }

  @GetMapping("getById/{id}")
  public Optional<Department>getDepaById(@PathVariable Long id) {
    return departmentService.getDepaById(id);
  }

  @DeleteMapping("deleteById/{id}")
  public String deleteById(@PathVariable Long id) {
    return departmentService.deleteById(id);
  }

  @GetMapping
  List<Department>getDepartment() {
    return departmentService.getDepartement();
  }
}
