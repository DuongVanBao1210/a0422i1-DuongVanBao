package codegym.vn.casestudy_spring.service;


import codegym.vn.casestudy_spring.entity.EmployeeDAO.Division;
import codegym.vn.casestudy_spring.entity.EmployeeDAO.EducationDegree;
import codegym.vn.casestudy_spring.entity.EmployeeDAO.Position;
import codegym.vn.casestudy_spring.repository.DivisionRepo;
import codegym.vn.casestudy_spring.repository.EducationDegreeRepo;
import codegym.vn.casestudy_spring.repository.PositionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDaoServiceImpl implements EmployeeDaoService {



    @Autowired
    PositionRepo positionRepo;
    @Autowired
    DivisionRepo divisionRepo;

    @Autowired
    EducationDegreeRepo educationDegreeRepo;

    @Override
    public List<Position> findAllPositions() {
        return positionRepo.findAll();
    }

    @Override
    public List<Division> findAllDivisions() {
        return divisionRepo.findAll();
    }

    @Override
    public List<EducationDegree> findAllEducationDegrees() {
        return educationDegreeRepo.findAll();
    }
}
