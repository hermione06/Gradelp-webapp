package com.example.Gradelp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Grade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private double grade; // User input grade
    private double coefficient; // Coefficient for each subject

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String name) {
        this.coefficient = switch (name) {
            case "math1-notebook" -> 1.0;
            case "math1-first-written" -> 2.0;
            case "math1-second-written" -> 3.;
            case "english-written-production" -> (3.0/4);
            case "english-oral-evaluation" -> (9.0/8);
            case "english-written-exam" -> (9.0/8);
            case "physics-fluid-mechanics" -> 1.2;
            case "physics-thermodynamics" -> 2.4;
            case "physics-point-mechanics" -> 2.4;
            case "chemistry-first-written" -> (2.0/3);
            case "chemistry-second-written" -> (4.0/3);
            case "chemistry-practical-work" -> 1.0;
            case "chemistry-reports" -> 0.5;
            case "chemistry-practical-behaviour" -> 0.5;
            case "front-end-participation" -> (11.0/4*0.1);
            case "front-end-project" -> (11.0/4*0.4);
            case "front-end-written" -> (11.0/4*0.5);
            case "dsa-practical" -> (11.0/2*0.5);
            case "dsa-written" -> (11.0/2*0.5);
            case "cs-practical" -> (11.0/4*0.4);
            case "cs-first-written" -> (11.0/4*0.2);
            case "cs-second-written" -> (11.0/4*0.4);
            default -> 1.0; // Default coefficient
        };
    }
}