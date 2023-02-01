package codegym.vn.casestudy_spring.repository;


import codegym.vn.casestudy_spring.entity.CustomerDAO.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTypleRepo  extends JpaRepository<CustomerType, Integer> {
}
