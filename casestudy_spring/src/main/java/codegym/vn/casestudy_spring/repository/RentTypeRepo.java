package codegym.vn.casestudy_spring.repository;

import codegym.vn.casestudy_spring.entity.ServiceDAO.RentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentTypeRepo extends JpaRepository<RentType, Integer> {
}
