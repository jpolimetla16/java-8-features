package com.jp.employee;

import java.util.Comparator;
import java.util.List;

public class YoungestMaleInProductDevelopment {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.filter(e->e.getDepartment().equalsIgnoreCase("Product Development"))
				.min(Comparator.comparing(Employee::getAge))
				.ifPresent(System.out::println);
	}
	
	

}
