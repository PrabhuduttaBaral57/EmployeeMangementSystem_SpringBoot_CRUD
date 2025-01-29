package com.pro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.employee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
