package com.example.bookshop.Service;

import com.example.bookshop.Model.CustomerModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookshop.Repository.CustomerRepository;

import java.util.List;

@Service
public class CustomerService {



    @Autowired
    CustomerRepository customerRepository;

    public CustomerModel createCustomer(CustomerModel theCustomer) {
        return customerRepository.save(theCustomer);
    }

    public CustomerModel findCustomer(String id) {
        return customerRepository.findById(id).get();
    }

    public List<CustomerModel> findAllCustomer() {
        return customerRepository.findAll();
    }

    public CustomerModel updateCustomer(CustomerModel customerModel, String id) {
        return customerRepository.save(customerModel);
    }

    public CustomerModel fillListOfCustomer(CustomerModel customerModel, String id) {
        return customerRepository.save(customerModel);
    }

    public String deleteCustomer(String id) {
        customerRepository.deleteById(id);
        return "id " + " has been deleted!";
    }

    public CustomerModel getBookListOfCustomer(String id) {
        return customerRepository.findCustomerModelById(id);
    }
}
