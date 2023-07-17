package com.example.KJSS_Assignment.repo;

import com.example.KJSS_Assignment.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IApplication extends JpaRepository<Application , Long> {
}
