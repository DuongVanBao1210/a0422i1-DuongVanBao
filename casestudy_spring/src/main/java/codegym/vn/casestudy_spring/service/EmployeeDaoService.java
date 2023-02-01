package codegym.vn.casestudy_spring.service;

import codegym.vn.casestudy_spring.entity.EmployeeDAO.Division;
import codegym.vn.casestudy_spring.entity.EmployeeDAO.EducationDegree;
import codegym.vn.casestudy_spring.entity.EmployeeDAO.Position;
import codegym.vn.casestudy_spring.repository.PositionRepo;
import org.springframework.stereotype.Service;

import java.util.List;


public  interface EmployeeDaoService {

    List<Position>  findAllPositions();
    List<Division>  findAllDivisions();
    List<EducationDegree>  findAllEducationDegrees();

}
