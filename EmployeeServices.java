package com.pro.empService;

import java.util.List;

import com.pro.employee.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();
	void save(Employee employee);
	Employee getById(Long id);
    void deleteViaId(long id);

}
