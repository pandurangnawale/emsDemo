package serviceImpl;

import java.util.List;

import model.Employee;
import service.EmployeeInterface;

public class ServiceImplimentation implements EmployeeInterface{

	@Override
	public List<Employee> getEmpById(int id) {		
		List<Employee> empAl= EmployeeInterface.empList();		
		return empAl;
	}

}