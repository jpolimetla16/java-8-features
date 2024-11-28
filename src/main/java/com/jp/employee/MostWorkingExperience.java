package com.jp.employee;

import java.util.Comparator;
import java.util.List;

public class MostWorkingExperience {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.min(Comparator.comparing(Employee::getYearOfJoining))
				.ifPresent(System.out::println);
	}

}
