package codegym.vn.casestudy_spring.service;

import codegym.vn.casestudy_spring.entity.ContractDao.ContractDetail;
import javafx.scene.control.Control;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ContractDetailService  extends  IService<ContractDetail>{

    List<ContractDetail> findByContract_IdContract(int contractId);
    Page<ContractDetail> findByContract_IdContract(int contractId, Pageable pageable);


    void addContractDetail(   int quantity, int id_attach_service, int id_contract );

    void updateContractDetail( int quantity, int id_attach_service, int id_contract );

    boolean  existsContractDetailByAttachService_IdAttachServiceAndContract_IdContract( int id_attach_service, int id_contract);
    ContractDetail findContractDetailByAttachService_IdAttachServiceAndContract_IdContract( int id_attach_service, int id_contract);

}
