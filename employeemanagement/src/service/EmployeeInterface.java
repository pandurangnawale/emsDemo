package service;

import java.util.ArrayList;
import java.util.List;

import model.Employee;

public interface EmployeeInterface {
	
	List<Employee> getEmpById(int empId);
	
	
	
	static List<Employee> empList() {
		List<Employee> empAl = new ArrayList<Employee>();
		empAl.add(new Employee(101, "Datta", "DATA101", "SW", 10000, "01082019"));
		empAl.add(new Employee(102, "Mahesh", "DATA101", "SW", 10000, "01082019"));		
		empAl.add(new Employee(103, "Vinod", "DATA101", "SW", 10000, "01082019"));
		empAl.add(new Employee(104, "Kunal", "DATA101", "SW", 10000, "01082019"));
		empAl.add(new Employee(105, "Pandu", "DATA101", "SW", 10000, "01082019"));
		return empAl;
	}
	
	
	
	
}
