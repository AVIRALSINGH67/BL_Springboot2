package com.example.SpringConcepts2.collector;

import com.example.SpringConcepts2.Bean.EmployeeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeBean employee;

    @GetMapping
    public String getEmployee() {
        return employee.getEmployeeDetails();
    }
}