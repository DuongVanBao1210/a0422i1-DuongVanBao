package codegym.vn.casestudy_spring.repository;


import codegym.vn.casestudy_spring.entity.ContractDao.AttachService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttachServiceRepo extends JpaRepository<AttachService, Integer> {
}
