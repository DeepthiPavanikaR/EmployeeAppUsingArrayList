package com.capg1.myEmployee.DB;

import java.util.ArrayList;
import com.capg1.myEmployee.dto.Employee;

public class EmployeeDB {
	public static // Employee cannot be resolved to a type
	ArrayList<Employee> list = new ArrayList<Employee>();

	static {

		list.add(new Employee(101, "ramesh", 8, 1000));
		list.add(new Employee(102, "suresh", 2, 3000));
		list.add(new Employee(103, "rakesh", 1, 5000));
		list.add(new Employee(104, "lokesh", 5, 7000));

	}

	public static boolean addEmployee(Employee e) {

		list.add(e);

		return true;
	}

	public static boolean editExpByEmployeeId(int id, int exp) {
		for (Employee employee : list) {
			if (employee.getEmployeeId() == id) {
				employee.setExp(exp);
				return true;
			}
		}
		return false;
	}

	public static boolean editSalaryByEmployeeId(int id, double sal) {
		for (Employee employee : list) {
			if (employee.getEmployeeId() == id) {
				employee.setSalary(sal);
				return true;
			}
		}
		return false;
	}

	public static ArrayList<Employee> getEmployeeByExperience(int exp) {
		for (Employee employee : list) {
			if (employee.getExp() == exp) {
				 System.out.println(employee);
			}
		}
		return null;
	}

	public static ArrayList<Employee> getEmployeeBySalary(double salary) {
		for (Employee employee : list) {
			if (employee.getSalary() == salary) {
			   System.out.println(employee);
			}
		}
		return null;
	}

	public static ArrayList<Employee> getEmployessBySalaryRange(double salaryRangeMin, double salaryRangeMax) {
		for (Employee employee : list) {
			if (employee.getSalary() >= salaryRangeMin && employee.getSalary() <= salaryRangeMax)
				 System.out.println(employee);
		}
		return null;
	}
}