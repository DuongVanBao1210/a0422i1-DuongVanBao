package codegym.vn.casestudy_spring.repository;

import codegym.vn.casestudy_spring.entity.EmployeeDAO.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PositionRepo extends JpaRepository<Position, Integer> {
}
