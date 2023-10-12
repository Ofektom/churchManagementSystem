package org.example.churchManagementSystem.entities;

import org.example.churchManagementSystem.enums.Designation;
import org.example.churchManagementSystem.enums.Gender;
import org.example.churchManagementSystem.enums.Qualification;

import java.time.LocalDate;

public class User {
    private String name;
    private Gender gender;
    private Address address;
    private LocalDate dateOfBirth;
    private Designation designation;
    private Branch branch;
    private Qualification highestQualification;
}
