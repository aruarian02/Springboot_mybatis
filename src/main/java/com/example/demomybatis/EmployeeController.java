package com.example.demomybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeMapper employeeMapper;

    @GetMapping
    public List<Employee> employeeList() {
        return employeeMapper.getAll();
    }

    @GetMapping("{id}")
    public Employee getEmployee(@PathVariable int id) {
        return employeeMapper.getEmployeeById(id);
    }

    @PostMapping
    public int post(@RequestBody Employee employee) {
        return employeeMapper.insert(employee);
    }
}
