package com.jp.medium;

import java.util.List;
import java.util.stream.Collectors;

import com.jp.employee.Employee;
import com.jp.employee.EmployeeService;

public class EmployeeCountInEachDepartment {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting())
						).entrySet().stream().forEach(System.out::println);
	}

}
