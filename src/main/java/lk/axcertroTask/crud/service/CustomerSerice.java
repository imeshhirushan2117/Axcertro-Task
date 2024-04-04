package lk.axcertroTask.crud.service;

import lk.axcertroTask.crud.dto.CustomerDTO;
import lk.axcertroTask.crud.entity.Customer;
import lk.axcertroTask.crud.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By Imesh Hirushan
 * Project Name : crud
 * Package Name : lk.axcertroTask.crud.service
 * Date : Apr 4, 2024
 * Time : 3:16 PM
 */

@Service
public class CustomerSerice {
    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerSerice(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public Customer saveCustomer(CustomerDTO customerDTO) {
        Customer save = customerRepo.save(new Customer(customerDTO.getFirstName(), customerDTO.getLastName(), customerDTO.getEmail()));
        return save;
    }

    public List<Customer> getAllCustomer() {
        List<Customer> all = customerRepo.findAll();
        return all;
    }

    public String deletedCustomer(Long customerId) {
        if (customerRepo.existsById(customerId)){
            customerRepo.deleteById(customerId);
            return "Customer Deleted!";
        }return null;
    }
}
