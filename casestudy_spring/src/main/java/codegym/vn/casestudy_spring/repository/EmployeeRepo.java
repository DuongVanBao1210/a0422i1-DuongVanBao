package codegym.vn.casestudy_spring.repository;


import codegym.vn.casestudy_spring.entity.EmployeeDAO.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, String> {
}
