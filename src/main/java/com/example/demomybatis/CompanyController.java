package com.example.demomybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyMapper companyMapper;
    private final CompanyService companyService;

    @GetMapping
    public List<Company> companyList() {
        return companyMapper.getAll();
    }

    @GetMapping("{id}")
    public Company getCompany(@PathVariable int id) {
        return companyMapper.getCompanyById(id);
    }

    @PostMapping
    public int post(@RequestBody Company company) {
        return companyService.addCompany(company) != null ? 1 : 0;
    }
}
