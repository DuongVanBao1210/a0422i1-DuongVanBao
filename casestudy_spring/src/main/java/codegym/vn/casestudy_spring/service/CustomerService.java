package codegym.vn.casestudy_spring.service;

import codegym.vn.casestudy_spring.entity.CustomerDAO.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface CustomerService extends IService<Customer> {

    Page<Customer> searchCustomer(  String customerName,
                                    String customerType,
                                    String genderSearch, Pageable pageable);
}
