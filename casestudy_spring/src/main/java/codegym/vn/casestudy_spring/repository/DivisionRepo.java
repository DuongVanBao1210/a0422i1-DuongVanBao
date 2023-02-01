package codegym.vn.casestudy_spring.repository;

import codegym.vn.casestudy_spring.entity.EmployeeDAO.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface DivisionRepo extends JpaRepository<Division, Integer> {
}
