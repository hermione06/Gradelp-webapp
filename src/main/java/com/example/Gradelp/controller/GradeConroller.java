package com.example.Gradelp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Gradelp.entity.Grade;
import com.example.Gradelp.service.GradeService;

@RestController
@RequestMapping("/grades")
public class GradeConroller{

    @Autowired
    private GradeService gradeService;

    @PostMapping("/calculate")
    public double calculateAverage(@RequestBody List<Grade> grades){
        return gradeService.calculateAverage(grades);        
    }

}
