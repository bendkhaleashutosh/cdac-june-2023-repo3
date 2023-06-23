package dao;

import org.springframework.beans.factory.annotation.Autowired;

import emp.EmployeeEn;

public interface EmployeeDao {
	
	public EmployeeEn addEmployee(EmployeeEn empEn);
}
