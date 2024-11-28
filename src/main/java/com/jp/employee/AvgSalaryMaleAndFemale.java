package com.jp.employee;

import java.util.List;
import java.util.stream.Collectors;

public class AvgSalaryMaleAndFemale {
	
	public static void main(String[] args) {
		
		List<Employee> list = EmployeeService.getEmployees();
		
		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,
						Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().stream().forEach(System.out::println);
	}

}
