package com.example.demomybatis;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Employee {
    private int id;
    private int companyId;
    private String name;
    private String address;
}
