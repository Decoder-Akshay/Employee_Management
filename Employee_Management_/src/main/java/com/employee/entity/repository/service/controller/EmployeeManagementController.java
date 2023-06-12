package com.employee.entity.repository.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.entity.EmployeeMaster;
import com.employee.entity.QualificationMaster;
import com.employee.entity.repository.QualificationMasterRepository;
import com.employee.entity.repository.service.EmployeeManagementServiceeImpl;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/employees")
public class EmployeeManagementController {

	@Autowired
	private final EmployeeManagementServiceeImpl employeeManagementService;

	@Autowired
	private final QualificationMasterRepository qualificationMasterRepository;

	public EmployeeManagementController(EmployeeManagementServiceeImpl employeeManagementService,
			QualificationMasterRepository qualificationMasterRepository) {
		this.employeeManagementService = employeeManagementService;
		this.qualificationMasterRepository = qualificationMasterRepository;
	}

	@GetMapping("/list")
	public String getEmployeeList(Model model) {
		List<EmployeeMaster> employees = employeeManagementService.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employee-list";
	}

	@GetMapping("/detail/{id}")
	public String getEmployeeDetail(@PathVariable("id") Long id, Model model) {
		EmployeeMaster employee = employeeManagementService.getEmployeeById(id);
		List<QualificationMaster> qualifications = qualificationMasterRepository.findAll();
		model.addAttribute("employee", employee);
		model.addAttribute("qualifications", qualifications);
		return "employee-detail";
	}

	@PostMapping("/update/{id}")
	public String updateEmployee(@PathVariable("id") Long id, @ModelAttribute("employee") EmployeeMaster employee) {
		employee.setId(id);
		employeeManagementService.updateEmployee(employee);
		return "redirect:/employees/list";
	}

	// Add more methods for handling create, delete, and other operations

	@ModelAttribute("employee")
	public EmployeeMaster getEmployeeModelAttribute() {
		return new EmployeeMaster();
	}

	@PostMapping("/employees/save")
    public String saveEmployee(HttpServletRequest request) {
        // Retrieve the updated data from the request parameters
        String employeeId = request.getParameter("employeeId");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String birthDate = request.getParameter("birthdate");

        // Update the employee in the database using the retrieved data

        // Redirect the user back to the employee list page or any other desired page
        return "redirect:/employees/list";
}
}
