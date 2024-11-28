package com.jp.employee;

import java.util.Comparator;
import java.util.List;

public class HighestPaidEmployee {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.max(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
		
	}

}
