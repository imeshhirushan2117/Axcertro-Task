package lk.axcertroTask.crud.controller;

import lk.axcertroTask.crud.service.CustomerSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
