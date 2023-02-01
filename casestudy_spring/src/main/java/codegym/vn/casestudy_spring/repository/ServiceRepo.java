package codegym.vn.casestudy_spring.repository;


import codegym.vn.casestudy_spring.entity.ServiceDAO.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepo extends JpaRepository<Service,Integer> {
}
