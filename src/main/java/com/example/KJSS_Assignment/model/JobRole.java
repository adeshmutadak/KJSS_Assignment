package com.example.KJSS_Assignment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Job Role")
public class JobRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long jobRoleId;

    @NotEmpty
    @Column(name = "JobRoleName")
    private String roleName;

    //@NotEmpty
    @Column(name = "Experience")
   // @Length(min = 0 , max = 30 , message = "Please Enter a Valid Experience")
    private String experience;

    @Column(name = "Location")
    private String location;

    @ManyToOne
    private Department department;
}
