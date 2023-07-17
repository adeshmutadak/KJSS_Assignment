package com.example.KJSS_Assignment.service;

import com.example.KJSS_Assignment.model.Department;
import com.example.KJSS_Assignment.repo.IDepartment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    IDepartment iDepartment;


    public String addDepa(Department department) {
         iDepartment.save(department);
         return "Department Added Successfully";
    }

    public Optional<Department> getDepaById(Long id) {
        return iDepartment.findById(id);
    }

    public String deleteById(Long id) {
        if(!iDepartment.findById(id).isPresent()) {
            return "Id Not Found";
        }
        iDepartment.deleteById(id);
        return "Department With this id Deleted Successfully";
    }

    public List<Department> getDepartement() {
        return iDepartment.findAll();
    }
}
