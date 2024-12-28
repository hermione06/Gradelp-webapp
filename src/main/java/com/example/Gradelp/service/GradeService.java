package com.example.Gradelp.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.Gradelp.entity.Grade;

@Service
public class GradeService {
    public double calculateAverage(List<Grade> grades){
        double totalWeighted = 0.0;
        double totalCoef = 0.0;

        for (Grade grade : grades){
            System.out.println("Received grades: " + grade.getGrade());
            grade.setCoefficient(grade.getName());
            System.out.println(grade.getCoefficient());
            totalWeighted += grade.getGrade() * grade.getCoefficient();
            totalCoef += grade.getCoefficient();            
        }
        return totalCoef == 0 ? 0 : totalWeighted / totalCoef;

    }

}