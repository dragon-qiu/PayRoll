package com.example.demo.payroll.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PersonalAnnualSalaryDTO {
    private String name;

    private Long annualSalary;
    private Date salaryStartTime;
    private Date slaryEndTime;
}
