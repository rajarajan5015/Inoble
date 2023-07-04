package com.onesoft;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public String addEmp(List<Employee> empList) {
		return employeeDao.addEmp(empList);
	}

	public String updateEmp(Employee id) {
		return employeeDao.updateEmp(id);
	}

	public List<Employee> getEmps() {
		return employeeDao.getEmps();
	}

	public Employee getEmpById(int id) {
		return employeeDao.getEmpById(id);
	}

	public String updateEmps(Employee emp) {
		return employeeDao.updateEmp(emp);
	}

	

	

}
