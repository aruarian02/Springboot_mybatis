package com.example.demomybatis;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Company {
    private int id;
    private String name;
    private String address;
    private List<Employee> employeeList;
}
