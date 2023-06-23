package repository;
import org.springframework.data.jpa.repository.JpaRepository;

import emp.EmployeeEn;

public interface EmployeeRepo extends JpaRepository<EmployeeEn, String> {

}
