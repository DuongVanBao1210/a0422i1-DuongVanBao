package codegym.vn.casestudy_spring.repository;

import codegym.vn.casestudy_spring.entity.EmployeeDAO.EducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationDegreeRepo  extends JpaRepository<EducationDegree, Integer> {
}
