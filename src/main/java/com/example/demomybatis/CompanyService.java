package com.example.demomybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyMapper companyMapper;
    private final EmployeeMapper employeeMapper;

    @Transactional(rollbackFor = Exception.class)
    public Company addCompany(Company company) {
        companyMapper.insert(company);
        throw new RuntimeException("Legacy Exception");
    }
}
