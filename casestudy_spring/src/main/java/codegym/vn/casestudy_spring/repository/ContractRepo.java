package codegym.vn.casestudy_spring.repository;

import codegym.vn.casestudy_spring.entity.ContractDao.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepo  extends JpaRepository<Contract, Integer> {
}
