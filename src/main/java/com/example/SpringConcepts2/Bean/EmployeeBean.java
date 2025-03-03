package com.example.SpringConcepts2.Bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {
    private String employeeName="Aviral Singh";

    @Autowired
    private com.example.SpringConcepts2.Bean.DepartmentBean department;

    public String getEmployeeDetails() {
        return "Employee: "+employeeName+", Department: "+department.getDepartmentName();
    }
}