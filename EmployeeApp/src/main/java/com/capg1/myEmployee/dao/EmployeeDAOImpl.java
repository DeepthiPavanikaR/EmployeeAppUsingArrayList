package com.capg1.myEmployee.dao;

import java.util.ArrayList;

import com.capg1.myEmployee.DB.EmployeeDB;
import com.capg1.myEmployee.dto.Employee;
import com.capg1.myEmployee.Exception.InvalidEmployeeIdException;
import com.capg1.myEmployee.Exception.WrongSalaryException;

public class EmployeeDAOImpl implements IEmployeeDAO {

	public boolean addEmployee(Employee e) throws WrongSalaryException{
         // SQL  insert into employee ...... 
		
		//System.out.println(" =====>> DAO Impl employee "+e);
		return EmployeeDB.addEmployee(e);
	}

	public ArrayList<Employee> getAllEmployees() {

		return EmployeeDB.list;
	}
	
	//============================================================
	
	
	public boolean editSalaryByEmployeeId(int id,double empNewSalary) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		return EmployeeDB.editSalaryByEmployeeId(id, empNewSalary);
	}

	public boolean editExpByEmployeeId(int id,int empNewExp) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		return EmployeeDB.editExpByEmployeeId(id, empNewExp);
	}

	public ArrayList<Employee> getEmployeeByExperience(int exp) {
		return EmployeeDB.getEmployeeByExperience(exp);
	}

	public ArrayList<Employee> getEmployeeBySalary(double salary) {
		return EmployeeDB.getEmployeeBySalary(salary);
	}

	public ArrayList<Employee> getEmployessBySalaryRange(double salaryRangeMin, double salaryRangeMax) {
		return EmployeeDB.getEmployessBySalaryRange(salaryRangeMin, salaryRangeMax);
	}

}


