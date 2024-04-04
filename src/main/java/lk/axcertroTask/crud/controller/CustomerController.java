package lk.axcertroTask.crud.controller;

import lk.axcertroTask.crud.dto.CustomerDTO;
import lk.axcertroTask.crud.entity.Customer;
import lk.axcertroTask.crud.service.CustomerSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created By Imesh Hirushan
 * Project Name : crud
 * Package Name : lk.axcertroTask.crud.controller
 * Date : Apr 4, 2024
 * Time : 3:16 PM
 */


@RestController
@RequestMapping("/api/crud")
@CrossOrigin
public class CustomerController {

    private final CustomerSerice customerSerice;

    @Autowired
    public CustomerController(CustomerSerice customerSerice) {
        this.customerSerice = customerSerice;
    }

    @PostMapping("/saveCustomer")
    public ResponseEntity<Object> saveCustomer(@RequestBody CustomerDTO customerDTO){
        try {
            Customer customer = customerSerice.saveCustomer(customerDTO);
            return new ResponseEntity<>(customer , HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("Customer Save Un Success!" , HttpStatus.FORBIDDEN);
        }
    }
}
