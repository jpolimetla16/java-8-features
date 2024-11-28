package com.jp.employee;

import java.util.List;
import java.util.stream.Collectors;

public class PartitioningEmployee {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		list.stream()
			.collect(Collectors.partitioningBy(e->e.getAge()>25))
			.entrySet().stream().forEach(System.out::println);
	}

}
