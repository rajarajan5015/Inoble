package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	public String addEmp(List<Employee> empList) {
		employeeRepository.saveAll(empList);
		 return "save all";
	}

	public String updateEmp(Employee id) {
		employeeRepository.save(id);
		return "update sucessfully";
	}

	public List<Employee> getEmps() {
		return employeeRepository.findAll();
	}

	public Employee getEmpById(int id) {
		return employeeRepository.findById(id).get();
	}

	public String updateEmps(Employee c) {
		Employee employee=employeeRepository.findById(c.getId()).get();
		employee.setExperience(c.getExperience());
		employee.getName();
		employee.getDob();
		employee.getEmail();
		employee.getPhonenumber();
		employeeRepository.save(c);
		return "update perticullar";
		
		
	}
	
		

}
