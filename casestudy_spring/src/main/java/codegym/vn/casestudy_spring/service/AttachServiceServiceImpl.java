package codegym.vn.casestudy_spring.service;


import codegym.vn.casestudy_spring.entity.ContractDao.AttachService;
import codegym.vn.casestudy_spring.repository.AttachServiceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceServiceImpl  implements AttachServiceService{

    @Autowired
    AttachServiceRepo attachServiceRepo;

    @Override
    public void delete(AttachService attachService) {

    }

    @Override
    public AttachService findById(String id) {
        return null;
    }

    @Override
    public void save(AttachService attachService) {

    }

    @Override
    public Page<AttachService> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<AttachService> getAll() {
        return attachServiceRepo.findAll();
    }
}
