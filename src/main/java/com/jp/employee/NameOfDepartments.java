package com.jp.employee;

import java.util.List;

public class NameOfDepartments {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

}
