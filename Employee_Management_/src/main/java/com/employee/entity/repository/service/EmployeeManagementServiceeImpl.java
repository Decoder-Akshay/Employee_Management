package com.employee.entity.repository.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.employee.entity.EmployeeMaster;
import com.employee.entity.repository.EmployeeMasterRepository;

@Service
public class EmployeeManagementServiceeImpl {

	private final EmployeeMasterRepository employeeMasterRepository;

    public EmployeeManagementServiceeImpl(EmployeeMasterRepository employeeMasterRepository) {
        this.employeeMasterRepository = employeeMasterRepository;
    }

    public List<EmployeeMaster> getAllEmployees() {
        return employeeMasterRepository.findAll();
    }

    public EmployeeMaster getEmployeeById(Long id) {
        return employeeMasterRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid employee ID: " + id));
    }

    public void updateEmployee(EmployeeMaster employee) {
        employeeMasterRepository.save(employee);
    }
}
