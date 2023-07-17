package com.example.KJSS_Assignment.controller;
import com.example.KJSS_Assignment.model.Application;
import com.example.KJSS_Assignment.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/application")
public class ApplicationController {

    @Autowired
    ApplicationService applicationService;

@PostMapping("/addApplication")
    public String createApplication(@RequestBody Application application) {
    return applicationService.createApplication(application);
}

    @GetMapping("/getApplication/{id}")
    public Optional<Application> getApplication(@PathVariable Long id) {
        return applicationService.getApplication(id);
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable  Long id) {
    return applicationService.deleteById(id);
    }

    @GetMapping("getAllApplications")
    public List<Application>getAllAppliactions() {
    return applicationService.getAllAppliactions();
    }


}
