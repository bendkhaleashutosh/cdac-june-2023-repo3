package dao;

import org.springframework.beans.factory.annotation.Autowired;

import emp.EmployeeEn;
import repository.EmployeeRepo;

public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EmployeeRepo empRepo;
	
	@Override
	public EmployeeEn addEmployee(EmployeeEn empEn) {
		return empRepo.save(empEn);
	}

	
}
