package com.jp.employee;

import java.util.List;

public class EmployeesAfter2015 {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.filter(e->e.getYearOfJoining()>2015)
				.map(e->e.getName())
				.forEach(System.out::println);
	}

}
