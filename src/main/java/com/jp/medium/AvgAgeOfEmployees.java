package com.jp.medium;

import java.util.List;

import com.jp.employee.Employee;
import com.jp.employee.EmployeeService;

public class AvgAgeOfEmployees {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.mapToDouble(Employee::getAge)
				.average().ifPresent(System.out::println);
		
	}

}
