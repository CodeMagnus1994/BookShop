package com.example.bookshop.Repository;

import com.example.bookshop.Model.CustomerModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerModel, String> {

    CustomerModel findCustomerModelById(String id);
    Optional<CustomerModel> findByEmail(String email);

}
