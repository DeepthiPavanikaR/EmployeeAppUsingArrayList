package com.capg1.myEmployee.service;

import com.capg1.myEmployee.dao.EmployeeDAOImpl;
import com.capg1.myEmployee.dao.IEmployeeDAO;
import com.capg1.myEmployee.dto.Employee;

import java.util.ArrayList;

import com.capg1.myEmployee.Exception.InvalidEmployeeIdException;
import com.capg1.myEmployee.Exception.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
	// Animal a = new Dog();
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {

		// System.out.println(" ------------>> inside service "+e);

		if (e.getSalary() > 50000) {
			throw new WrongSalaryException();
		} else
			return dao.addEmployee(e);

	}

	public ArrayList<Employee> getAllEmployees() {

		return dao.getAllEmployees();
	}

	// ================================================================================

	public boolean editSalaryByEmployeeId(int id, double salary) throws InvalidEmployeeIdException {
		
		if (!dao.editSalaryByEmployeeId(id, salary)) {
			throw new InvalidEmployeeIdException();
		} else
			return dao.editSalaryByEmployeeId(id, salary);
	}

	public boolean editExpByEmployeeId(int id, int exp) throws InvalidEmployeeIdException {
		
		if (!dao.editExpByEmployeeId(id, exp)) {
			throw new InvalidEmployeeIdException();
		} else
			return dao.editExpByEmployeeId(id, exp);
	}

	public ArrayList<Employee> getEmployeeBySalary(double salary) {

		return dao.getEmployeeBySalary(salary);
	}
	
	public ArrayList<Employee> getEmployeeByExperience(int exp) {

		return dao.getEmployeeByExperience(exp);
	}


	public ArrayList<Employee> getEmployessBySalaryRange(double salaryRangeMin, double salaryRangeMax) {
		// TODO Auto-generated method stub
		return dao.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}
}