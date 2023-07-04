package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/addEmp")
	public String addEmp(@RequestBody List<Employee> empList) {
		return employeeService.addEmp(empList);
	}
	
	@PutMapping("/updateEmp/{id}")
	public String updateEmp(@RequestBody Employee id) {
		return employeeService.updateEmp(id);
	}
	@GetMapping(value="/getEmps")
	public List<Employee> getEmps(){
		List<Employee> empList  = employeeService.getEmps();
		return empList;
	}
	@GetMapping(value="/getEmp/{id}")
	public Employee getEmpById(@PathVariable int id) {
		return employeeService.getEmpById(id);
	}
	@PatchMapping(value="/updateemp")
	public String updateEmps(@RequestBody Employee employee) {
		return employeeService.updateEmp(employee);
	}
	

}
