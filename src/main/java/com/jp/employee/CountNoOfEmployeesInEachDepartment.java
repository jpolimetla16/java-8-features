package com.jp.employee;

import java.util.List;
import java.util.stream.Collectors;

public class CountNoOfEmployeesInEachDepartment {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
			.collect(Collectors.groupingBy(Employee::getDepartment,
					Collectors.counting()))
			.entrySet().stream().forEach(System.out::println);
				
	}

}
