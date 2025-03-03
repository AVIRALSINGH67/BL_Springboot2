package com.example.SpringConcepts2.Bean;

import org.springframework.stereotype.Component;
@Component
public class DepartmentBean {
    private String departmentName="IT department";

    public String getDepartmentName() {
        return departmentName;
    }
}