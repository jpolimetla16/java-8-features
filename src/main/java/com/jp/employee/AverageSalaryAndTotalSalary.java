package com.jp.employee;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class AverageSalaryAndTotalSalary {
	
	public static void main(String[] args) {
		List<Employee> list = EmployeeService.getEmployees();
		DoubleSummaryStatistics stats = list.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println(stats.getAverage());
		System.out.println(stats.getSum());
	}

}
