package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import emp.EmployeeDTO;
import emp.EmployeeEn;
import service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmpController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/add")
	public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee) {
		EmployeeDTO empDto = empService.addEmployee(employee);
		return empDto;
	}

}
