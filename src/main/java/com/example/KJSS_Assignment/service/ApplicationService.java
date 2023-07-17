package com.example.KJSS_Assignment.service;

import com.example.KJSS_Assignment.model.Application;
import com.example.KJSS_Assignment.repo.IApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationService {

    @Autowired
    IApplication iApplication;


    public String createApplication(Application application) {
        iApplication.save(application);
        return "Application Created";
    }

    public Optional<Application> getApplication(Long id) {
    return iApplication.findById(id);
    }

    public String deleteById(Long id) {
       if(!iApplication.findById(id).isPresent()) {
           return "Id Not Present";
       }
       iApplication.deleteById(id);
       return "Application Deleted Successfully";
    }

    public List<Application> getAllAppliactions() {
        return iApplication.findAll();
    }
}

