package service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import dao.EmployeeDao;
import emp.EmployeeDTO;
import emp.EmployeeEn;

public class EmpSeviceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public EmployeeDTO addEmployee(EmployeeDTO employeeDto) {
		EmployeeEn empEn = mapper.map(employeeDto, EmployeeEn.class);
		EmployeeEn empEn1 = employeeDao.addEmployee(empEn);
		EmployeeDTO empDto = mapper.map(empEn1, EmployeeDTO.class);
		return empDto;
	}

}
