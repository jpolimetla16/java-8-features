package com.jp.employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeesInEachDepartment {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
						Collectors.mapping(Employee::getName, Collectors.toList())))
				.entrySet().stream().forEach(System.out::println);
	}

}
