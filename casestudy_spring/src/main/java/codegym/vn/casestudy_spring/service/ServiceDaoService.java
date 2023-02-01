package codegym.vn.casestudy_spring.service;

import codegym.vn.casestudy_spring.entity.ServiceDAO.RentType;
import codegym.vn.casestudy_spring.entity.ServiceDAO.Service;
import codegym.vn.casestudy_spring.entity.ServiceDAO.ServiceType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ServiceDaoService {

    List<RentType> findAllRentTypes();
    List<ServiceType> findAllServiceTypes();
    void delete(int e);
    Service findById(int id);
    void save(Service e);
    Page<Service> getAll(Pageable pageable);
    List<Service> getAll();
}
