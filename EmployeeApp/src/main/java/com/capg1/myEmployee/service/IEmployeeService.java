package com.capg1.myEmployee.service;

import com.capg1.myEmployee.dto.Employee;

import java.util.ArrayList;

import com.capg1.myEmployee.Exception.InvalidEmployeeIdException;
import com.capg1.myEmployee.Exception.WrongSalaryException;

public interface IEmployeeService {
	
	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id,double salary)throws InvalidEmployeeIdException;
	 
	 public boolean editExpByEmployeeId(int id,int exp)throws InvalidEmployeeIdException;
	 
	 public ArrayList<Employee> getAllEmployees();
	 
	 public ArrayList<Employee> getEmployeeByExperience(int exp);
	 
	 public ArrayList<Employee> getEmployeeBySalary(double salary);
	 
	 public ArrayList<Employee> getEmployessBySalaryRange(double salaryRangeMin,double salaryRangeMax);

}