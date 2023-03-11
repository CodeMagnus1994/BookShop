package com.example.bookshop.Controller;

import com.example.bookshop.Model.BookModel;
import com.example.bookshop.Model.CustomerModel;
import com.example.bookshop.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/customer/")
public class CustomerController {

    @Autowired
    CustomerService customerService;


    @PostMapping("createcustomer")
    public CustomerModel createCustomer(@RequestBody CustomerModel customerModel) {
        return customerService.createCustomer(customerModel);
    }

    @GetMapping("findcustomer/{id}")
    public CustomerModel findCustomer(@PathVariable String id) {
        return customerService.findCustomer(id);
    }

    @GetMapping("findallcustomer")
    public List<CustomerModel> findAllCustomer() {
        return customerService.findAllCustomer();
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updatecustomer/{id}")
    public CustomerModel updateCustomer(@RequestBody CustomerModel customerModel, @PathVariable String id) {
        return customerService.updateCustomer(customerModel, id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "fillcustomerlist/{id}")
    public CustomerModel fillCustomerList (@RequestBody CustomerModel customerModel, @PathVariable String id) {
        return customerService.fillListOfCustomer(customerModel, id);
    }

    // Hitta lista
    @GetMapping("findcustomerlist/{id}")
    public Set<BookModel> findListOfBooks(@PathVariable String id) {

        CustomerModel customerModel = customerService.getBookListOfCustomer(id); // Hämtar id från databas
        Set<BookModel> wantedBooks = customerModel.getWantedBooks(); // Hämtar data ifrån tabell som matchar
        // på sagt id.

        return wantedBooks;
    }

    @DeleteMapping("deletecustomer/{id}")
    public String deleteCustomer(@PathVariable String id) {
        return customerService.deleteCustomer(id);
    }

}
