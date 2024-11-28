package com.jp.employee;

import java.util.List;
import java.util.stream.Collectors;

public class AverageAgeOfMaleAndFemale {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.collect(Collectors.groupingBy(Employee::getGender,
						Collectors.averagingDouble(Employee::getAge)))
				.entrySet().stream().forEach(System.out::println);
	}

}
